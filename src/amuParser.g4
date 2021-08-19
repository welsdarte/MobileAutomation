parser grammar amuParser;

options {
	tokenVocab = amuLexer;
}
body: scenarios testCases;
testCases
    : NEW_LINE* (test NEW_LINE*)*
    ;
test
    : TEST_OPEN (label NEW_LINE)+ test_close
    ;
test_close
    : NEW_LINE* CLOSE_BRACE NEW_LINE
    ;
scenarios
    : (scenario NEW_LINE*)*
    ;
scenario
    : SCENARIO_OPEN line+ scenario_close
    ;
scenario_close
    : NEW_LINE* RB NEW_LINE*;
line
    : (action end) NEW_LINE*
    | (action FINALLY) NEW_LINE*
    | label NEW_LINE*
    ;
label
    : SCENARIO_REF
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
    | I TYPE STRING
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
    | I SWIPE FROM element TO element // getting two points from two different elements and swiping one from other ( havent tried it yet)
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
