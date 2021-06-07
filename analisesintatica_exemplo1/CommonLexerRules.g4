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

ID: [a-zA-Z]+;
INT: [0-9]+;
NEWLINE: '\r'? '\n';
WS: [ \t]+ -> skip;

OR: '||';
AND: '&&';
EQ: '==';
NEQ: '!=';
GT: '>';
LT: '<';
GTEQ: '>=';
LTEQ: '<=';

// PRINTLN: 'println' '\r'? '\n'*;

IF: 'if';
ELSE: 'else';
