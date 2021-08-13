parser grammar amuParser;

options {
	tokenVocab = amuLexer;
}

scenario
    : head body
    ;
head
    : SCENARIO STRING NEW_LINE?
    ;
body
    : line+
    ;
line
    : (action end?) NEW_LINE
    ;
action
    : actionClick
    | actionType
    | actionWait
    | actionScroll
    | actionSwipe
    ;
end
    : THEN
    | AND
    ;
actionClick
    : I CLICK element
    | I CLICK DIRECTION OF element
    | I CLICK X_PIXEL DIRECTION OF element
    | I CLICK THE X_TH INDEXABLE_ELEMENT // without x_th maybe
    | I CLICK THE POINT point
    ;
actionType
    : I TYPE STRING TO element
    ;
actionWait
    : I WAIT
    | I WAIT X_SECONDS
    ;
actionScroll
    : I SCROLL
    | I SCROLL X_TIMES
    | I SCROLL X_TIMES TO_CLICK element
    ;
actionSwipe
    : I SWIPE DIRECTION
    | I SWIPE DIRECTION FROM element
    | I SWIPE DIRECTION FROM element X_PIXEL
    | I SWIPE FROM element TO element // getting two points from two different elements and swiping one from the other ( havent tried it yet)
    | I SWIPE FROM point TO point
    ;
element
    : STRING
    ;
point
    : OPEN_BRACE INTEGER COMMA INTEGER CLOSE_BRACE
    | INTEGER COMMA INTEGER
    | INTEGER MINUS INTEGER
    | INTEGER INTEGER
    ;
