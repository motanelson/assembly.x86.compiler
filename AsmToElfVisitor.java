import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.*;

public class AsmToElfVisitor extends asmBaseVisitor<Void> {

    private List<Byte> code = new ArrayList<>();
    private Map<String, Integer> labels = new HashMap<>();
    private List<Fixup> fixups = new ArrayList<>();

    static class Fixup {
        String label;
        int position;

        Fixup(String label, int position) {
            this.label = label;
            this.position = position;
        }
    }

    // ==========================
    // Helpers
    // ==========================

    private void emit(int b) {
        code.add((byte)(b & 0xFF));
    }

    private void emitInt(int value) {
        emit(value);
        emit(value >> 8);
        emit(value >> 16);
        emit(value >> 24);
    }

    private int getRegisterCode(String reg) {
        switch (reg) {
            case "eax": return 0;
            case "ecx": return 1;
            case "edx": return 2;
            case "ebx": return 3;
            case "esp": return 4;
            case "ebp": return 5;
            case "esi": return 6;
            case "edi": return 7;
        }
        throw new RuntimeException("Registo inválido: " + reg);
    }

    // ==========================
    // Labels
    // ==========================

    @Override
    public Void visitLabelDefinition(asmParser.LabelDefinitionContext ctx) {
        String name = ctx.Identifier().getText();
        labels.put(name, code.size());
        return null;
    }

    // ==========================
    // Instruções
    // ==========================

    @Override
    public Void visitInstruction(asmParser.InstructionContext ctx) {
        String op = ctx.mnemonic().getText();

        if (op.equals("mov")) {
            handleMov(ctx);
        } else if (op.equals("int")) {
            handleInt(ctx);
        } else if (op.equals("jmp")) {
            handleJmp(ctx);
        } else {
            throw new RuntimeException("Opcode não suportado: " + op);
        }

        return null;
    }

    private void handleMov(asmParser.InstructionContext ctx) {
        String reg = ctx.operandList().operand(0).getText();
        String imm = ctx.operandList().operand(1).getText();

        int regCode = getRegisterCode(reg);
        int value = parseNumber(imm);

        emit(0xB8 + regCode); // mov reg, imm32
        emitInt(value);
    }

    private void handleInt(asmParser.InstructionContext ctx) {
        int value = parseNumber(ctx.operandList().operand(0).getText());
        emit(0xCD);
        emit(value);
    }

    private void handleJmp(asmParser.InstructionContext ctx) {
        String label = ctx.operandList().operand(0).getText();

        emit(0xE9); // jmp rel32

        int pos = code.size();
        emitInt(0); // placeholder

        fixups.add(new Fixup(label, pos));
    }

    private int parseNumber(String txt) {
        txt = txt.replace("$", "");
        if (txt.startsWith("0x")) {
            return Integer.parseInt(txt.substring(2), 16);
        }
        return Integer.parseInt(txt);
    }

    // ==========================
    // Finalização
    // ==========================

    public void writeELF(String filename) throws Exception {

        // resolver labels
        for (Fixup f : fixups) {
            if (!labels.containsKey(f.label)) {
                throw new RuntimeException("Label não encontrada: " + f.label);
            }

            int target = labels.get(f.label);
            int rel = target - (f.position + 4);

            writeIntAt(f.position, rel);
        }

        byte[] codeArray = toArray(code);
        byte[] elf = buildELF(codeArray);

        try (FileOutputStream fos = new FileOutputStream(filename)) {
            fos.write(elf);
        }
    }

    private void writeIntAt(int pos, int value) {
        code.set(pos, (byte)(value & 0xFF));
        code.set(pos+1, (byte)((value >> 8) & 0xFF));
        code.set(pos+2, (byte)((value >> 16) & 0xFF));
        code.set(pos+3, (byte)((value >> 24) & 0xFF));
    }

    private byte[] toArray(List<Byte> list) {
        byte[] arr = new byte[list.size()];
        for (int i = 0; i < list.size(); i++) arr[i] = list.get(i);
        return arr;
    }

    // ==========================
    // ELF builder
    // ==========================

    private byte[] buildELF(byte[] code) {

        int entry = 0x08048000 + 0x54;

        ByteBuffer buf = ByteBuffer.allocate(0x54 + code.length);
        buf.order(ByteOrder.LITTLE_ENDIAN);

        // ELF Header
        buf.put(new byte[]{
            0x7F, 'E', 'L', 'F',
            1, 1, 1, 0,0,0,0,0,0,0,0,0
        });

        buf.putShort((short)2);
        buf.putShort((short)3);
        buf.putInt(1);
        buf.putInt(entry);
        buf.putInt(52);
        buf.putInt(0);
        buf.putInt(0);
        buf.putShort((short)52);
        buf.putShort((short)32);
        buf.putShort((short)1);
        buf.putShort((short)0);
        buf.putShort((short)0);
        buf.putShort((short)0);

        // Program Header
        buf.putInt(1);
        buf.putInt(0);
        buf.putInt(0x08048000);
        buf.putInt(0x08048000);
        buf.putInt(0x54 + code.length);
        buf.putInt(0x54 + code.length);
        buf.putInt(5);
        buf.putInt(0x1000);

        buf.put(code);

        return buf.array();
    }
}