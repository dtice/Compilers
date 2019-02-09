package com.company;
// Generated from littleLexer.g4 by ANTLR 4.7.2
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
		KEYWORD=1, IDENTIFIER=2, INTLITERAL=3, FLOATLITERAL=4, STRINGLITERAL=5, 
		COMMENT=6, OPERATOR=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"KEYWORD", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
			"COMMENT", "OPERATOR", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "KEYWORD", "IDENTIFIER", "INTLITERAL", "FLOATLITERAL", "STRINGLITERAL", 
			"COMMENT", "OPERATOR", "WS"
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
	public String getGrammarFileName() { return "littleLexer.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\n\u00b6\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\2\5\2q\n\2\3\3\3\3\7\3u\n\3\f\3\16\3x\13\3\3\4\6\4{\n\4\r\4\16"+
		"\4|\3\5\3\5\6\5\u0081\n\5\r\5\16\5\u0082\3\5\6\5\u0086\n\5\r\5\16\5\u0087"+
		"\3\5\3\5\6\5\u008c\n\5\r\5\16\5\u008d\5\5\u0090\n\5\3\6\3\6\7\6\u0094"+
		"\n\6\f\6\16\6\u0097\13\6\3\6\3\6\3\7\3\7\3\7\3\7\7\7\u009f\n\7\f\7\16"+
		"\7\u00a2\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b\u00ae\n\b\3"+
		"\t\6\t\u00b1\n\t\r\t\16\t\u00b2\3\t\3\t\3\u0095\2\n\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\3\2\b\4\2C\\c|\5\2\62;C\\c|\4\2\f\f\17\17\6\2,-//\61"+
		"\61??\6\2*+..=>@@\5\2\13\f\17\17\"\"\2\u00d4\2\3\3\2\2\2\2\5\3\2\2\2\2"+
		"\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2"+
		"\2\2\3p\3\2\2\2\5r\3\2\2\2\7z\3\2\2\2\t\u008f\3\2\2\2\13\u0091\3\2\2\2"+
		"\r\u009a\3\2\2\2\17\u00ad\3\2\2\2\21\u00b0\3\2\2\2\23\24\7R\2\2\24\25"+
		"\7T\2\2\25\26\7Q\2\2\26\27\7I\2\2\27\30\7T\2\2\30\31\7C\2\2\31q\7O\2\2"+
		"\32\33\7D\2\2\33\34\7G\2\2\34\35\7I\2\2\35\36\7K\2\2\36q\7P\2\2\37 \7"+
		"G\2\2 !\7P\2\2!q\7F\2\2\"#\7H\2\2#$\7W\2\2$%\7P\2\2%&\7E\2\2&\'\7V\2\2"+
		"\'(\7K\2\2()\7Q\2\2)q\7P\2\2*+\7T\2\2+,\7G\2\2,-\7C\2\2-q\7F\2\2./\7Y"+
		"\2\2/\60\7T\2\2\60\61\7K\2\2\61\62\7V\2\2\62q\7G\2\2\63\64\7K\2\2\64q"+
		"\7H\2\2\65\66\7G\2\2\66\67\7N\2\2\678\7U\2\28q\7G\2\29:\7G\2\2:;\7P\2"+
		"\2;<\7F\2\2<=\7K\2\2=q\7H\2\2>?\7Y\2\2?@\7J\2\2@A\7K\2\2AB\7N\2\2Bq\7"+
		"G\2\2CD\7G\2\2DE\7P\2\2EF\7F\2\2FG\7Y\2\2GH\7J\2\2HI\7K\2\2IJ\7N\2\2J"+
		"q\7G\2\2KL\7E\2\2LM\7Q\2\2MN\7P\2\2NO\7V\2\2OP\7K\2\2PQ\7P\2\2QR\7W\2"+
		"\2Rq\7G\2\2ST\7D\2\2TU\7T\2\2UV\7G\2\2VW\7C\2\2Wq\7M\2\2XY\7T\2\2YZ\7"+
		"G\2\2Z[\7V\2\2[\\\7W\2\2\\]\7T\2\2]q\7P\2\2^_\7K\2\2_`\7P\2\2`q\7V\2\2"+
		"ab\7X\2\2bc\7Q\2\2cd\7K\2\2dq\7F\2\2ef\7U\2\2fg\7V\2\2gh\7T\2\2hi\7K\2"+
		"\2ij\7P\2\2jq\7I\2\2kl\7H\2\2lm\7N\2\2mn\7Q\2\2no\7C\2\2oq\7V\2\2p\23"+
		"\3\2\2\2p\32\3\2\2\2p\37\3\2\2\2p\"\3\2\2\2p*\3\2\2\2p.\3\2\2\2p\63\3"+
		"\2\2\2p\65\3\2\2\2p9\3\2\2\2p>\3\2\2\2pC\3\2\2\2pK\3\2\2\2pS\3\2\2\2p"+
		"X\3\2\2\2p^\3\2\2\2pa\3\2\2\2pe\3\2\2\2pk\3\2\2\2q\4\3\2\2\2rv\t\2\2\2"+
		"su\t\3\2\2ts\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\6\3\2\2\2xv\3\2\2"+
		"\2y{\4\62;\2zy\3\2\2\2{|\3\2\2\2|z\3\2\2\2|}\3\2\2\2}\b\3\2\2\2~\u0080"+
		"\7\60\2\2\177\u0081\4\62;\2\u0080\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082"+
		"\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0090\3\2\2\2\u0084\u0086\4\62"+
		";\2\u0085\u0084\3\2\2\2\u0086\u0087\3\2\2\2\u0087\u0085\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\u0089\3\2\2\2\u0089\u008b\7\60\2\2\u008a\u008c\4"+
		"\62;\2\u008b\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008b\3\2\2\2\u008d"+
		"\u008e\3\2\2\2\u008e\u0090\3\2\2\2\u008f~\3\2\2\2\u008f\u0085\3\2\2\2"+
		"\u0090\n\3\2\2\2\u0091\u0095\7$\2\2\u0092\u0094\13\2\2\2\u0093\u0092\3"+
		"\2\2\2\u0094\u0097\3\2\2\2\u0095\u0096\3\2\2\2\u0095\u0093\3\2\2\2\u0096"+
		"\u0098\3\2\2\2\u0097\u0095\3\2\2\2\u0098\u0099\7$\2\2\u0099\f\3\2\2\2"+
		"\u009a\u009b\7/\2\2\u009b\u009c\7/\2\2\u009c\u00a0\3\2\2\2\u009d\u009f"+
		"\n\4\2\2\u009e\u009d\3\2\2\2\u009f\u00a2\3\2\2\2\u00a0\u009e\3\2\2\2\u00a0"+
		"\u00a1\3\2\2\2\u00a1\16\3\2\2\2\u00a2\u00a0\3\2\2\2\u00a3\u00a4\7<\2\2"+
		"\u00a4\u00ae\7?\2\2\u00a5\u00ae\t\5\2\2\u00a6\u00a7\7#\2\2\u00a7\u00ae"+
		"\7?\2\2\u00a8\u00ae\t\6\2\2\u00a9\u00aa\7>\2\2\u00aa\u00ae\7?\2\2\u00ab"+
		"\u00ac\7@\2\2\u00ac\u00ae\7?\2\2\u00ad\u00a3\3\2\2\2\u00ad\u00a5\3\2\2"+
		"\2\u00ad\u00a6\3\2\2\2\u00ad\u00a8\3\2\2\2\u00ad\u00a9\3\2\2\2\u00ad\u00ab"+
		"\3\2\2\2\u00ae\20\3\2\2\2\u00af\u00b1\t\7\2\2\u00b0\u00af\3\2\2\2\u00b1"+
		"\u00b2\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\3\2"+
		"\2\2\u00b4\u00b5\b\t\2\2\u00b5\22\3\2\2\2\16\2pv|\u0082\u0087\u008d\u008f"+
		"\u0095\u00a0\u00ad\u00b2\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}