// Generated from asm.g4 by ANTLR 4.9.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class asmParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, Identifier=19, Integer=20, Hexadecimal=21, STRING=22, COMMENT=23, 
		Whitespace=24, NEWLINE=25;
	public static final int
		RULE_program = 0, RULE_line = 1, RULE_labelDefinition = 2, RULE_instruction = 3, 
		RULE_operandList = 4, RULE_mnemonic = 5, RULE_directive = 6, RULE_operand = 7, 
		RULE_register = 8, RULE_immediate = 9, RULE_memory = 10, RULE_memoryExpr = 11;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "line", "labelDefinition", "instruction", "operandList", "mnemonic", 
			"directive", "operand", "register", "immediate", "memory", "memoryExpr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "':'", "','", "'section'", "'global'", "'extern'", "'eax'", "'ebx'", 
			"'ecx'", "'edx'", "'esp'", "'ebp'", "'esi'", "'edi'", "'$'", "'['", "']'", 
			"'+'", "'-'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, "Identifier", "Integer", "Hexadecimal", 
			"STRING", "COMMENT", "Whitespace", "NEWLINE"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "asm.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public asmParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ProgramContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(asmParser.EOF, 0); }
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(asmParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(asmParser.NEWLINE, i);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << Identifier) | (1L << NEWLINE))) != 0)) {
				{
				setState(26);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__2:
				case T__3:
				case T__4:
				case Identifier:
					{
					setState(24);
					line();
					}
					break;
				case NEWLINE:
					{
					setState(25);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(31);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public LabelDefinitionContext labelDefinition() {
			return getRuleContext(LabelDefinitionContext.class,0);
		}
		public InstructionContext instruction() {
			return getRuleContext(InstructionContext.class,0);
		}
		public DirectiveContext directive() {
			return getRuleContext(DirectiveContext.class,0);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitLine(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_line);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(36);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(33);
				labelDefinition();
				}
				break;
			case 2:
				{
				setState(34);
				instruction();
				}
				break;
			case 3:
				{
				setState(35);
				directive();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LabelDefinitionContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(asmParser.Identifier, 0); }
		public LabelDefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelDefinition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterLabelDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitLabelDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitLabelDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelDefinitionContext labelDefinition() throws RecognitionException {
		LabelDefinitionContext _localctx = new LabelDefinitionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_labelDefinition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			match(Identifier);
			setState(39);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class InstructionContext extends ParserRuleContext {
		public MnemonicContext mnemonic() {
			return getRuleContext(MnemonicContext.class,0);
		}
		public OperandListContext operandList() {
			return getRuleContext(OperandListContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitInstruction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitInstruction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_instruction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			mnemonic();
			setState(43);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(42);
				operandList();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandListContext extends ParserRuleContext {
		public List<OperandContext> operand() {
			return getRuleContexts(OperandContext.class);
		}
		public OperandContext operand(int i) {
			return getRuleContext(OperandContext.class,i);
		}
		public OperandListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operandList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterOperandList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitOperandList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitOperandList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandListContext operandList() throws RecognitionException {
		OperandListContext _localctx = new OperandListContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_operandList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			operand();
			setState(50);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(46);
				match(T__1);
				setState(47);
				operand();
				}
				}
				setState(52);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MnemonicContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(asmParser.Identifier, 0); }
		public MnemonicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mnemonic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterMnemonic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitMnemonic(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitMnemonic(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MnemonicContext mnemonic() throws RecognitionException {
		MnemonicContext _localctx = new MnemonicContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mnemonic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(53);
			match(Identifier);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DirectiveContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(asmParser.STRING, 0); }
		public TerminalNode Identifier() { return getToken(asmParser.Identifier, 0); }
		public DirectiveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_directive; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterDirective(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitDirective(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitDirective(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectiveContext directive() throws RecognitionException {
		DirectiveContext _localctx = new DirectiveContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_directive);
		try {
			setState(61);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				match(T__2);
				setState(56);
				match(STRING);
				}
				break;
			case T__3:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				match(T__3);
				setState(58);
				match(Identifier);
				}
				break;
			case T__4:
				enterOuterAlt(_localctx, 3);
				{
				setState(59);
				match(T__4);
				setState(60);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperandContext extends ParserRuleContext {
		public RegisterContext register() {
			return getRuleContext(RegisterContext.class,0);
		}
		public ImmediateContext immediate() {
			return getRuleContext(ImmediateContext.class,0);
		}
		public MemoryContext memory() {
			return getRuleContext(MemoryContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(asmParser.Identifier, 0); }
		public OperandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterOperand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitOperand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitOperand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperandContext operand() throws RecognitionException {
		OperandContext _localctx = new OperandContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_operand);
		try {
			setState(67);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__5:
			case T__6:
			case T__7:
			case T__8:
			case T__9:
			case T__10:
			case T__11:
			case T__12:
				enterOuterAlt(_localctx, 1);
				{
				setState(63);
				register();
				}
				break;
			case T__13:
			case Integer:
			case Hexadecimal:
				enterOuterAlt(_localctx, 2);
				{
				setState(64);
				immediate();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 3);
				{
				setState(65);
				memory();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 4);
				{
				setState(66);
				match(Identifier);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RegisterContext extends ParserRuleContext {
		public RegisterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_register; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterRegister(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitRegister(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitRegister(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegisterContext register() throws RecognitionException {
		RegisterContext _localctx = new RegisterContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_register);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__9) | (1L << T__10) | (1L << T__11) | (1L << T__12))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImmediateContext extends ParserRuleContext {
		public TerminalNode Integer() { return getToken(asmParser.Integer, 0); }
		public TerminalNode Hexadecimal() { return getToken(asmParser.Hexadecimal, 0); }
		public ImmediateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_immediate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterImmediate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitImmediate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitImmediate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImmediateContext immediate() throws RecognitionException {
		ImmediateContext _localctx = new ImmediateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_immediate);
		int _la;
		try {
			setState(79);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(71);
					match(T__13);
					}
				}

				setState(74);
				match(Integer);
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				{
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__13) {
					{
					setState(75);
					match(T__13);
					}
				}

				setState(78);
				match(Hexadecimal);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemoryContext extends ParserRuleContext {
		public MemoryExprContext memoryExpr() {
			return getRuleContext(MemoryExprContext.class,0);
		}
		public MemoryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memory; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterMemory(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitMemory(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitMemory(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryContext memory() throws RecognitionException {
		MemoryContext _localctx = new MemoryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_memory);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__14);
			setState(82);
			memoryExpr();
			setState(83);
			match(T__15);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MemoryExprContext extends ParserRuleContext {
		public List<RegisterContext> register() {
			return getRuleContexts(RegisterContext.class);
		}
		public RegisterContext register(int i) {
			return getRuleContext(RegisterContext.class,i);
		}
		public List<TerminalNode> Integer() { return getTokens(asmParser.Integer); }
		public TerminalNode Integer(int i) {
			return getToken(asmParser.Integer, i);
		}
		public MemoryExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_memoryExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).enterMemoryExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof asmListener ) ((asmListener)listener).exitMemoryExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof asmVisitor ) return ((asmVisitor<? extends T>)visitor).visitMemoryExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MemoryExprContext memoryExpr() throws RecognitionException {
		MemoryExprContext _localctx = new MemoryExprContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_memoryExpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85);
			register();
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__16 || _la==T__17) {
				{
				{
				setState(86);
				_la = _input.LA(1);
				if ( !(_la==T__16 || _la==T__17) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(89);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case T__5:
				case T__6:
				case T__7:
				case T__8:
				case T__9:
				case T__10:
				case T__11:
				case T__12:
					{
					setState(87);
					register();
					}
					break;
				case Integer:
					{
					setState(88);
					match(Integer);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33c\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\4\r\t\r\3\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3\'\n\3\3\4\3\4\3\4\3\5\3\5\5\5.\n\5\3\6\3\6\3\6\7\6\63\n\6\f\6\16\6"+
		"\66\13\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\5\b@\n\b\3\t\3\t\3\t\3\t\5\t"+
		"F\n\t\3\n\3\n\3\13\5\13K\n\13\3\13\3\13\5\13O\n\13\3\13\5\13R\n\13\3\f"+
		"\3\f\3\f\3\f\3\r\3\r\3\r\3\r\5\r\\\n\r\7\r^\n\r\f\r\16\ra\13\r\3\r\2\2"+
		"\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\b\17\3\2\23\24\2f\2\36\3\2\2"+
		"\2\4&\3\2\2\2\6(\3\2\2\2\b+\3\2\2\2\n/\3\2\2\2\f\67\3\2\2\2\16?\3\2\2"+
		"\2\20E\3\2\2\2\22G\3\2\2\2\24Q\3\2\2\2\26S\3\2\2\2\30W\3\2\2\2\32\35\5"+
		"\4\3\2\33\35\7\33\2\2\34\32\3\2\2\2\34\33\3\2\2\2\35 \3\2\2\2\36\34\3"+
		"\2\2\2\36\37\3\2\2\2\37!\3\2\2\2 \36\3\2\2\2!\"\7\2\2\3\"\3\3\2\2\2#\'"+
		"\5\6\4\2$\'\5\b\5\2%\'\5\16\b\2&#\3\2\2\2&$\3\2\2\2&%\3\2\2\2\'\5\3\2"+
		"\2\2()\7\25\2\2)*\7\3\2\2*\7\3\2\2\2+-\5\f\7\2,.\5\n\6\2-,\3\2\2\2-.\3"+
		"\2\2\2.\t\3\2\2\2/\64\5\20\t\2\60\61\7\4\2\2\61\63\5\20\t\2\62\60\3\2"+
		"\2\2\63\66\3\2\2\2\64\62\3\2\2\2\64\65\3\2\2\2\65\13\3\2\2\2\66\64\3\2"+
		"\2\2\678\7\25\2\28\r\3\2\2\29:\7\5\2\2:@\7\30\2\2;<\7\6\2\2<@\7\25\2\2"+
		"=>\7\7\2\2>@\7\25\2\2?9\3\2\2\2?;\3\2\2\2?=\3\2\2\2@\17\3\2\2\2AF\5\22"+
		"\n\2BF\5\24\13\2CF\5\26\f\2DF\7\25\2\2EA\3\2\2\2EB\3\2\2\2EC\3\2\2\2E"+
		"D\3\2\2\2F\21\3\2\2\2GH\t\2\2\2H\23\3\2\2\2IK\7\20\2\2JI\3\2\2\2JK\3\2"+
		"\2\2KL\3\2\2\2LR\7\26\2\2MO\7\20\2\2NM\3\2\2\2NO\3\2\2\2OP\3\2\2\2PR\7"+
		"\27\2\2QJ\3\2\2\2QN\3\2\2\2R\25\3\2\2\2ST\7\21\2\2TU\5\30\r\2UV\7\22\2"+
		"\2V\27\3\2\2\2W_\5\22\n\2X[\t\3\2\2Y\\\5\22\n\2Z\\\7\26\2\2[Y\3\2\2\2"+
		"[Z\3\2\2\2\\^\3\2\2\2]X\3\2\2\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\31\3\2"+
		"\2\2a_\3\2\2\2\16\34\36&-\64?EJNQ[_";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}