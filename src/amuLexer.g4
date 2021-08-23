lexer grammar amuLexer;

SCENARIO_OPEN
	: SCENARIO_IDENT NEW_LINE* LB NEW_LINE+
	;
TEST_OPEN
    : TEST_IDENT NEW_LINE* OPEN_BRACE NEW_LINE*
    ;
SCENARIO_REF
    : '<' ' '* SCENARIO_IDENT ' '* '>'
    | '<' ' '* SCENARIO_IDENT ' '* COLON' '* INTEGER ' '* '>'
    ;
fragment SCENARIO_IDENT
    : [_a-zA-Z][_0-9a-zA-Z]*
    ;
fragment TEST_IDENT
    : [_a-zA-Z][_0-9a-zA-Z]*
    ;
I:                'I';
OPEN_BRACE:       '(';
CLOSE_BRACE:      ')';
LB:               '{';
RB:               '}';
X:                'x';
Y:                'y';
COMMA:            ',';
COLON:            ':';
MINUS:            '-';
TO:              'to';
FROM:          'from';
THE:            'the';
OF:              'of';
TO_CLICK: TO ' press';
SECONDS:    'seconds';
POINT:        'point';
TIMES:        'times';
MAX:            'max';


//Directions
DIRECTION: UP | DOWN | LEFT | RIGHT;
fragment UP:      'up';
fragment DOWN:  'down';
fragment LEFT:  'left';
fragment RIGHT:'right';

//White spaces
fragment SPACE
	: [ \t]+
	;
CARRIAGE_RETURN: '\r';
NEW_LINE:        '\n';

//Action types
CLICK:   'clicked' | 'click';
TYPE:      'typed' | 'type';
WAIT:     'waited' | 'wait';
SCROLL: 'scrolled' | 'scroll';
SWIPE:    'swiped' | 'swipe';

//Line ending words
THEN: 'then';
AND: 'and';

FINALLY: 'finally' | 'lastly';

STRING
	: '"' STRING_CONTENT* '"'
	| '\''STRING_CONTENT* '\''
	;
fragment STRING_CONTENT:    ~[\\\r\n'"]
                         	| '\\' [abfnrtv'"\\]
                         	;
fragment COMMENT
	: '//' ~[\r\n]*
	;
INTEGER: DEC+;

fragment DEC
	: [0-9]
	;
fragment PX: 'px';
fragment TH : 'st'| 'nd'| 'rd'| 'th';

X_PIXEL: INTEGER PX;
X_TH : INTEGER TH;
X_SECONDS: INTEGER ' ' SECONDS;
X_TIMES: INTEGER ' ' TIMES;

//elements that can be reached by xpath index only
INDEXABLE_ELEMENT: 'switch';

SKIP_
    : ( SPACE | COMMENT ) -> skip
    ;