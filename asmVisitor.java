// Generated from asm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link asmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface asmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link asmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(asmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(asmParser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#labelDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelDefinition(asmParser.LabelDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(asmParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#operandList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperandList(asmParser.OperandListContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#mnemonic}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMnemonic(asmParser.MnemonicContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#directive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirective(asmParser.DirectiveContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#operand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperand(asmParser.OperandContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#register}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegister(asmParser.RegisterContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#immediate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImmediate(asmParser.ImmediateContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#memory}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemory(asmParser.MemoryContext ctx);
	/**
	 * Visit a parse tree produced by {@link asmParser#memoryExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMemoryExpr(asmParser.MemoryExprContext ctx);
}