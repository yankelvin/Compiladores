lexer grammar CommonLexerRules;

MUL: '*';
DIV: '/';
ADD: '+';
SUB: '-';
ASSIGN: '=';
APARE: '(';
FPARE: ')';
ACHAV: '{';
FCHAV: '}';
ACOL: '[';
FCOL: ']';
PTVIG: ';';

NEWLINE: '\r'? '\n';
COMMENT: '//' ~[\r\n]* -> skip;
WS: [ \t]+ -> skip;

OR: '||';
AND: '&&';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';

IF: 'if';
ELSE: 'else';
WHILE: 'while';
FOR: 'for';
CONST: 'const';

ARRAY: 'array';

STRING: '"' (~["\r\n] | '""')* '"';

ID: [a-zA-Z]+;
INT: [0-9]+;
FLOAT: [0-9]+ '.' [0-9]* | '.' [0-9]+;