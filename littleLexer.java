// Generated from little.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class littleLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		IDENTIFIER=32, INTLITERAL=33, FLOATLITERAL=34, STRINGLITERAL=35, COMMENT=36, 
		KEYWORD=37, OPERATOR=38, WS=39;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
			"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
			"T__25", "T__26", "T__27", "T__28", "T__29", "T__30", "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "KEYWORD", "OPERATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'PROGRAM'", "'BEGIN'", "'END'", "'STRING'", "':='", "'FLOAT'", 
			"'INT'", "'VOID'", "','", "'FUNCTION'", "';'", "'READ'", "'('", "')'", 
			"'WRITE'", "'RETURN'", "'+'", "'-'", "'*'", "'/'", "'IF'", "'ENDIF'", 
			"'ELSE'", "'<'", "'>'", "'='", "'!='", "'<='", "'>='", "'WHILE'", "'ENDWHILE'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, "IDENTIFIER", "INTLITERAL", 
			"FLOATLITERAL", "STRINGLITERAL", "COMMENT", "KEYWORD", "OPERATOR", "WS"
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


	public littleLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "little.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2)\u0174\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f"+
		"\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24"+
		"\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3 \3 \3 "+
		"\3 \3!\6!\u00d5\n!\r!\16!\u00d6\3\"\6\"\u00da\n\"\r\"\16\"\u00db\3#\3"+
		"#\6#\u00e0\n#\r#\16#\u00e1\3#\6#\u00e5\n#\r#\16#\u00e6\3#\3#\6#\u00eb"+
		"\n#\r#\16#\u00ec\5#\u00ef\n#\3$\3$\7$\u00f3\n$\f$\16$\u00f6\13$\3$\3$"+
		"\3%\3%\3%\3%\7%\u00fe\n%\f%\16%\u0101\13%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3"+
		"&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\5&\u0160\n&\3\'\3\'\3\'\3"+
		"\'\3\'\3\'\3\'\3\'\3\'\3\'\5\'\u016c\n\'\3(\6(\u016f\n(\r(\16(\u0170\3"+
		"(\3(\2\2)\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33"+
		"\17\35\20\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67"+
		"\359\36;\37= ?!A\"C#E$G%I&K\'M(O)\3\2\b\4\2C\\c|\4\2\62;C|\4\2\f\f\17"+
		"\17\6\2,-//\61\61??\6\2*+..=>@@\5\2\13\f\17\17\"\"\2\u0192\2\3\3\2\2\2"+
		"\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2"+
		"\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2"+
		"\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2"+
		"\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2"+
		"\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2"+
		"\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2"+
		"\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\3Q\3\2\2\2\5Y\3\2\2\2\7_\3\2\2\2\tc"+
		"\3\2\2\2\13j\3\2\2\2\rm\3\2\2\2\17s\3\2\2\2\21w\3\2\2\2\23|\3\2\2\2\25"+
		"~\3\2\2\2\27\u0087\3\2\2\2\31\u0089\3\2\2\2\33\u008e\3\2\2\2\35\u0090"+
		"\3\2\2\2\37\u0092\3\2\2\2!\u0098\3\2\2\2#\u009f\3\2\2\2%\u00a1\3\2\2\2"+
		"\'\u00a3\3\2\2\2)\u00a5\3\2\2\2+\u00a7\3\2\2\2-\u00aa\3\2\2\2/\u00b0\3"+
		"\2\2\2\61\u00b5\3\2\2\2\63\u00b7\3\2\2\2\65\u00b9\3\2\2\2\67\u00bb\3\2"+
		"\2\29\u00be\3\2\2\2;\u00c1\3\2\2\2=\u00c4\3\2\2\2?\u00ca\3\2\2\2A\u00d4"+
		"\3\2\2\2C\u00d9\3\2\2\2E\u00ee\3\2\2\2G\u00f0\3\2\2\2I\u00f9\3\2\2\2K"+
		"\u015f\3\2\2\2M\u016b\3\2\2\2O\u016e\3\2\2\2QR\7R\2\2RS\7T\2\2ST\7Q\2"+
		"\2TU\7I\2\2UV\7T\2\2VW\7C\2\2WX\7O\2\2X\4\3\2\2\2YZ\7D\2\2Z[\7G\2\2[\\"+
		"\7I\2\2\\]\7K\2\2]^\7P\2\2^\6\3\2\2\2_`\7G\2\2`a\7P\2\2ab\7F\2\2b\b\3"+
		"\2\2\2cd\7U\2\2de\7V\2\2ef\7T\2\2fg\7K\2\2gh\7P\2\2hi\7I\2\2i\n\3\2\2"+
		"\2jk\7<\2\2kl\7?\2\2l\f\3\2\2\2mn\7H\2\2no\7N\2\2op\7Q\2\2pq\7C\2\2qr"+
		"\7V\2\2r\16\3\2\2\2st\7K\2\2tu\7P\2\2uv\7V\2\2v\20\3\2\2\2wx\7X\2\2xy"+
		"\7Q\2\2yz\7K\2\2z{\7F\2\2{\22\3\2\2\2|}\7.\2\2}\24\3\2\2\2~\177\7H\2\2"+
		"\177\u0080\7W\2\2\u0080\u0081\7P\2\2\u0081\u0082\7E\2\2\u0082\u0083\7"+
		"V\2\2\u0083\u0084\7K\2\2\u0084\u0085\7Q\2\2\u0085\u0086\7P\2\2\u0086\26"+
		"\3\2\2\2\u0087\u0088\7=\2\2\u0088\30\3\2\2\2\u0089\u008a\7T\2\2\u008a"+
		"\u008b\7G\2\2\u008b\u008c\7C\2\2\u008c\u008d\7F\2\2\u008d\32\3\2\2\2\u008e"+
		"\u008f\7*\2\2\u008f\34\3\2\2\2\u0090\u0091\7+\2\2\u0091\36\3\2\2\2\u0092"+
		"\u0093\7Y\2\2\u0093\u0094\7T\2\2\u0094\u0095\7K\2\2\u0095\u0096\7V\2\2"+
		"\u0096\u0097\7G\2\2\u0097 \3\2\2\2\u0098\u0099\7T\2\2\u0099\u009a\7G\2"+
		"\2\u009a\u009b\7V\2\2\u009b\u009c\7W\2\2\u009c\u009d\7T\2\2\u009d\u009e"+
		"\7P\2\2\u009e\"\3\2\2\2\u009f\u00a0\7-\2\2\u00a0$\3\2\2\2\u00a1\u00a2"+
		"\7/\2\2\u00a2&\3\2\2\2\u00a3\u00a4\7,\2\2\u00a4(\3\2\2\2\u00a5\u00a6\7"+
		"\61\2\2\u00a6*\3\2\2\2\u00a7\u00a8\7K\2\2\u00a8\u00a9\7H\2\2\u00a9,\3"+
		"\2\2\2\u00aa\u00ab\7G\2\2\u00ab\u00ac\7P\2\2\u00ac\u00ad\7F\2\2\u00ad"+
		"\u00ae\7K\2\2\u00ae\u00af\7H\2\2\u00af.\3\2\2\2\u00b0\u00b1\7G\2\2\u00b1"+
		"\u00b2\7N\2\2\u00b2\u00b3\7U\2\2\u00b3\u00b4\7G\2\2\u00b4\60\3\2\2\2\u00b5"+
		"\u00b6\7>\2\2\u00b6\62\3\2\2\2\u00b7\u00b8\7@\2\2\u00b8\64\3\2\2\2\u00b9"+
		"\u00ba\7?\2\2\u00ba\66\3\2\2\2\u00bb\u00bc\7#\2\2\u00bc\u00bd\7?\2\2\u00bd"+
		"8\3\2\2\2\u00be\u00bf\7>\2\2\u00bf\u00c0\7?\2\2\u00c0:\3\2\2\2\u00c1\u00c2"+
		"\7@\2\2\u00c2\u00c3\7?\2\2\u00c3<\3\2\2\2\u00c4\u00c5\7Y\2\2\u00c5\u00c6"+
		"\7J\2\2\u00c6\u00c7\7K\2\2\u00c7\u00c8\7N\2\2\u00c8\u00c9\7G\2\2\u00c9"+
		">\3\2\2\2\u00ca\u00cb\7G\2\2\u00cb\u00cc\7P\2\2\u00cc\u00cd\7F\2\2\u00cd"+
		"\u00ce\7Y\2\2\u00ce\u00cf\7J\2\2\u00cf\u00d0\7K\2\2\u00d0\u00d1\7N\2\2"+
		"\u00d1\u00d2\7G\2\2\u00d2@\3\2\2\2\u00d3\u00d5\t\2\2\2\u00d4\u00d3\3\2"+
		"\2\2\u00d5\u00d6\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d6\u00d7\3\2\2\2\u00d7"+
		"B\3\2\2\2\u00d8\u00da\4\62;\2\u00d9\u00d8\3\2\2\2\u00da\u00db\3\2\2\2"+
		"\u00db\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dcD\3\2\2\2\u00dd\u00df\7"+
		"\60\2\2\u00de\u00e0\4\62;\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2\2\2\u00e1"+
		"\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00ef\3\2\2\2\u00e3\u00e5\4\62"+
		";\2\u00e4\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00e4\3\2\2\2\u00e6"+
		"\u00e7\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\7\60\2\2\u00e9\u00eb\4"+
		"\62;\2\u00ea\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00ea\3\2\2\2\u00ec"+
		"\u00ed\3\2\2\2\u00ed\u00ef\3\2\2\2\u00ee\u00dd\3\2\2\2\u00ee\u00e4\3\2"+
		"\2\2\u00efF\3\2\2\2\u00f0\u00f4\7$\2\2\u00f1\u00f3\t\3\2\2\u00f2\u00f1"+
		"\3\2\2\2\u00f3\u00f6\3\2\2\2\u00f4\u00f2\3\2\2\2\u00f4\u00f5\3\2\2\2\u00f5"+
		"\u00f7\3\2\2\2\u00f6\u00f4\3\2\2\2\u00f7\u00f8\7$\2\2\u00f8H\3\2\2\2\u00f9"+
		"\u00fa\7/\2\2\u00fa\u00fb\7/\2\2\u00fb\u00ff\3\2\2\2\u00fc\u00fe\n\4\2"+
		"\2\u00fd\u00fc\3\2\2\2\u00fe\u0101\3\2\2\2\u00ff\u00fd\3\2\2\2\u00ff\u0100"+
		"\3\2\2\2\u0100J\3\2\2\2\u0101\u00ff\3\2\2\2\u0102\u0103\7R\2\2\u0103\u0104"+
		"\7T\2\2\u0104\u0105\7Q\2\2\u0105\u0106\7I\2\2\u0106\u0107\7T\2\2\u0107"+
		"\u0108\7C\2\2\u0108\u0160\7O\2\2\u0109\u010a\7D\2\2\u010a\u010b\7G\2\2"+
		"\u010b\u010c\7I\2\2\u010c\u010d\7K\2\2\u010d\u0160\7P\2\2\u010e\u010f"+
		"\7G\2\2\u010f\u0110\7P\2\2\u0110\u0160\7F\2\2\u0111\u0112\7H\2\2\u0112"+
		"\u0113\7W\2\2\u0113\u0114\7P\2\2\u0114\u0115\7E\2\2\u0115\u0116\7V\2\2"+
		"\u0116\u0117\7K\2\2\u0117\u0118\7Q\2\2\u0118\u0160\7P\2\2\u0119\u011a"+
		"\7T\2\2\u011a\u011b\7G\2\2\u011b\u011c\7C\2\2\u011c\u0160\7F\2\2\u011d"+
		"\u011e\7Y\2\2\u011e\u011f\7T\2\2\u011f\u0120\7K\2\2\u0120\u0121\7V\2\2"+
		"\u0121\u0160\7G\2\2\u0122\u0123\7K\2\2\u0123\u0160\7H\2\2\u0124\u0125"+
		"\7G\2\2\u0125\u0126\7N\2\2\u0126\u0127\7U\2\2\u0127\u0160\7G\2\2\u0128"+
		"\u0129\7G\2\2\u0129\u012a\7P\2\2\u012a\u012b\7F\2\2\u012b\u012c\7K\2\2"+
		"\u012c\u0160\7H\2\2\u012d\u012e\7Y\2\2\u012e\u012f\7J\2\2\u012f\u0130"+
		"\7K\2\2\u0130\u0131\7N\2\2\u0131\u0160\7G\2\2\u0132\u0133\7G\2\2\u0133"+
		"\u0134\7P\2\2\u0134\u0135\7F\2\2\u0135\u0136\7Y\2\2\u0136\u0137\7J\2\2"+
		"\u0137\u0138\7K\2\2\u0138\u0139\7N\2\2\u0139\u0160\7G\2\2\u013a\u013b"+
		"\7E\2\2\u013b\u013c\7Q\2\2\u013c\u013d\7P\2\2\u013d\u013e\7V\2\2\u013e"+
		"\u013f\7K\2\2\u013f\u0140\7P\2\2\u0140\u0141\7W\2\2\u0141\u0160\7G\2\2"+
		"\u0142\u0143\7D\2\2\u0143\u0144\7T\2\2\u0144\u0145\7G\2\2\u0145\u0146"+
		"\7C\2\2\u0146\u0160\7M\2\2\u0147\u0148\7T\2\2\u0148\u0149\7G\2\2\u0149"+
		"\u014a\7V\2\2\u014a\u014b\7W\2\2\u014b\u014c\7T\2\2\u014c\u0160\7P\2\2"+
		"\u014d\u014e\7K\2\2\u014e\u014f\7P\2\2\u014f\u0160\7V\2\2\u0150\u0151"+
		"\7X\2\2\u0151\u0152\7Q\2\2\u0152\u0153\7K\2\2\u0153\u0160\7F\2\2\u0154"+
		"\u0155\7U\2\2\u0155\u0156\7V\2\2\u0156\u0157\7T\2\2\u0157\u0158\7K\2\2"+
		"\u0158\u0159\7P\2\2\u0159\u0160\7I\2\2\u015a\u015b\7H\2\2\u015b\u015c"+
		"\7N\2\2\u015c\u015d\7Q\2\2\u015d\u015e\7C\2\2\u015e\u0160\7V\2\2\u015f"+
		"\u0102\3\2\2\2\u015f\u0109\3\2\2\2\u015f\u010e\3\2\2\2\u015f\u0111\3\2"+
		"\2\2\u015f\u0119\3\2\2\2\u015f\u011d\3\2\2\2\u015f\u0122\3\2\2\2\u015f"+
		"\u0124\3\2\2\2\u015f\u0128\3\2\2\2\u015f\u012d\3\2\2\2\u015f\u0132\3\2"+
		"\2\2\u015f\u013a\3\2\2\2\u015f\u0142\3\2\2\2\u015f\u0147\3\2\2\2\u015f"+
		"\u014d\3\2\2\2\u015f\u0150\3\2\2\2\u015f\u0154\3\2\2\2\u015f\u015a\3\2"+
		"\2\2\u0160L\3\2\2\2\u0161\u0162\7<\2\2\u0162\u016c\7?\2\2\u0163\u016c"+
		"\t\5\2\2\u0164\u0165\7#\2\2\u0165\u016c\7?\2\2\u0166\u016c\t\6\2\2\u0167"+
		"\u0168\7>\2\2\u0168\u016c\7?\2\2\u0169\u016a\7@\2\2\u016a\u016c\7?\2\2"+
		"\u016b\u0161\3\2\2\2\u016b\u0163\3\2\2\2\u016b\u0164\3\2\2\2\u016b\u0166"+
		"\3\2\2\2\u016b\u0167\3\2\2\2\u016b\u0169\3\2\2\2\u016cN\3\2\2\2\u016d"+
		"\u016f\t\7\2\2\u016e\u016d\3\2\2\2\u016f\u0170\3\2\2\2\u0170\u016e\3\2"+
		"\2\2\u0170\u0171\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0173\b(\2\2\u0173"+
		"P\3\2\2\2\17\2\u00d6\u00db\u00e1\u00e6\u00ec\u00ee\u00f2\u00f4\u00ff\u015f"+
		"\u016b\u0170\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}