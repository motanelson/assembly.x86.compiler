import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.nio.file.Files;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {

        CharStream input = CharStreams.fromFileName(args[0]);
        asmLexer lexer = new asmLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        asmParser parser = new asmParser(tokens);

        ParseTree tree = parser.program();

        AsmToElfVisitor visitor = new AsmToElfVisitor();
        visitor.visit(tree);

        visitor.writeELF("output");

        System.out.println("ELF gerado!");
    }
}
