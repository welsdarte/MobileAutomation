grammar g;
case: premise (line NEW_LINE)* line;
premise: SCENARIO description;
description: DOUBLEQUOTE sentence DOUBLEQUOTE;

number: DIGIT+;
sentence: ((word | DIGIT)  ws*)*;

line: action end;

SCENARIO: 'Scenario: ';
I: 'I';
DOUBLEQUOTE: '"';
SINGLEQUOTE: '\'';
LEFT_PARANTHESIS: '(';
RIGHT_PARANTHESIS: ')';
COMMA: ',';
TO: 'to';
FROM: 'from';
THE: 'the';
OF: 'of';
TO_CLICK: 'to click';
SECONDS: 'seconds';
TIMES: 'times';
MAX: 'max';

direction: UP | DOWN | LEFT | RIGHT;
UP:      'up';
DOWN:  'down';
LEFT:  'left';
RIGHT:'right';

word: (UPPER | LOWER)+;
UPPER: 'A'..'Z' |'Ç'|'Ğ'|'İ'|'Ö'|'Ş'|'Ü';
LOWER: 'a'..'z' |'ç'|'ğ'|'ö'|'ş'|'ü';
DIGIT: '0'..'9';


ws: (SPACE | INDENT | CARRIAGE_RETURN | NEW_LINE)+;
WS : [ \t\r]+ -> skip ;
SPACE:            ' ';
INDENT:          '\t';
CARRIAGE_RETURN: '\r';
NEW_LINE:        '\n';

CLICK:   'clicked' | 'click';
TYPE:      'typed' | 'type';
WAIT:     'waited' | 'wait';
SCROLL: 'scrolled' | 'scroll';
SWIPE:    'swiped' | 'swipe';
action_click
    : I  CLICK  element
    | I ws CLICK  ws pixel_length ws direction ws OF ws element
    | I ws CLICK  ws THE x_th INDEXABLE_ELEMENT
    ;
action_type
    : I ws TYPE   ws single_quote_string ws TO ws element;
action_wait
    : I ws WAIT
    | I ws WAIT   ws x_seconds
    ;
action_scroll
    : I ws SCROLL
    | I ws SCROLL ws x_times
    | I ws SCROLL ws x_times ws TO_CLICK ws element
    ;
action_swipe
    :  I ws SWIPE  ws direction
    |  I ws SWIPE  ws direction ws FROM ws element
    |  I ws SWIPE  ws direction ws FROM ws element ws pixel_length
    |  I ws SWIPE  ws FROM ws point ws TO ws point
    ;
action: action_click | action_type | action_wait| action_scroll | action_swipe;

end: THEN | AND;
THEN: 'then';
AND: 'and';

element: DOUBLEQUOTE (UPPER | LOWER) ws* sentence DOUBLEQUOTE;

single_quote_string: SINGLEQUOTE sentence SINGLEQUOTE;

x_seconds: number ws SECONDS;
x_times: number ws TIMES;

PX: 'px';
TH: 'st'| 'nd' | 'rd' | 'th';
INDEXABLE_ELEMENT: DOUBLEQUOTE 'switch' DOUBLEQUOTE ;
x_th: number TH;
pixel_length: number PX;

point: LEFT_PARANTHESIS number COMMA number RIGHT_PARANTHESIS;









