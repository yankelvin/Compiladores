grammar LabeledExpr;

import CommonLexerRules;

prog: stat+;

stat:
	'println' APARE expr FPARE	# println
	| ID ASSIGN expr NEWLINE	# assign
	| if_else_stat				# none
	| while_stat				# none
	| NEWLINE					# blank
	| '/*' prog '*/'			# comentary;

expr:
	expr op = (MUL | DIV) expr					# MulDiv
	| expr op = (ADD | SUB) expr				# AddSub
	| expr op = (LTEQ | GTEQ | LT | GT) expr	# RelationalExpr
	| expr op = (EQ | NEQ) expr					# EqualityExpr
	| expr AND expr								# AndExpr
	| expr OR expr								# OrExpr
	| INT										# int
	| ID										# id
	| APARE expr FPARE							# parens;

if_else_stat: IF condition_block (ELSE code_block)?;

while_stat: WHILE expr code_block;

condition_block: expr code_block;

code_block: ACHAV stat* FCHAV | stat;
