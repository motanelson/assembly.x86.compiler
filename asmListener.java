// Generated from asm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link asmParser}.
 */
public interface asmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link asmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(asmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(asmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#line}.
	 * @param ctx the parse tree
	 */
	void enterLine(asmParser.LineContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#line}.
	 * @param ctx the parse tree
	 */
	void exitLine(asmParser.LineContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void enterLabelDefinition(asmParser.LabelDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#labelDefinition}.
	 * @param ctx the parse tree
	 */
	void exitLabelDefinition(asmParser.LabelDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(asmParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(asmParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#operandList}.
	 * @param ctx the parse tree
	 */
	void enterOperandList(asmParser.OperandListContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#operandList}.
	 * @param ctx the parse tree
	 */
	void exitOperandList(asmParser.OperandListContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#mnemonic}.
	 * @param ctx the parse tree
	 */
	void enterMnemonic(asmParser.MnemonicContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#mnemonic}.
	 * @param ctx the parse tree
	 */
	void exitMnemonic(asmParser.MnemonicContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(asmParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(asmParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#operand}.
	 * @param ctx the parse tree
	 */
	void enterOperand(asmParser.OperandContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#operand}.
	 * @param ctx the parse tree
	 */
	void exitOperand(asmParser.OperandContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#register}.
	 * @param ctx the parse tree
	 */
	void enterRegister(asmParser.RegisterContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#register}.
	 * @param ctx the parse tree
	 */
	void exitRegister(asmParser.RegisterContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void enterImmediate(asmParser.ImmediateContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#immediate}.
	 * @param ctx the parse tree
	 */
	void exitImmediate(asmParser.ImmediateContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#memory}.
	 * @param ctx the parse tree
	 */
	void enterMemory(asmParser.MemoryContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#memory}.
	 * @param ctx the parse tree
	 */
	void exitMemory(asmParser.MemoryContext ctx);
	/**
	 * Enter a parse tree produced by {@link asmParser#memoryExpr}.
	 * @param ctx the parse tree
	 */
	void enterMemoryExpr(asmParser.MemoryExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link asmParser#memoryExpr}.
	 * @param ctx the parse tree
	 */
	void exitMemoryExpr(asmParser.MemoryExprContext ctx);
}