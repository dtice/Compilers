lexer grammar littleLexer;
    
KEYWORD
: 'PROGRAM'
| 'BEGIN'
| 'END'
| 'FUNCTION'
| 'READ'
| 'WRITE'
| 'IF'
| 'ELSE'
| 'ENDIF'
| 'WHILE'
| 'ENDWHILE'
| 'CONTINUE'
| 'BREAK'
| 'RETURN'
| 'INT'
| 'VOID'
| 'STRING'
| 'FLOAT'
;
    
IDENTIFIER
   : ('a' .. 'z' | 'A' .. 'Z')('a' .. 'z' | 'A'..'Z' | '0' .. '9')*
   ;
    
INTLITERAL
    : ('0'..'9')+
    ;
    
FLOATLITERAL
    : '.'('0'..'9')+
    | ('0'..'9')+'.'('0'..'9')+
    ;
    
STRINGLITERAL
    : '"'(.)*?'"'
    ;
    
COMMENT
    :  '--' ~[\r\n]*
    ;
    
OPERATOR
    : ':='
    | '+'
    | '-'
    | '*'
    | '/'
    | '='
    | '!='
    | '<'
    | '>'
    | '('
    | ')'
    | ';'
    | ','
    | '<='
    | '>='
    ;
    
WS: [ \t\n\r]+ -> skip;