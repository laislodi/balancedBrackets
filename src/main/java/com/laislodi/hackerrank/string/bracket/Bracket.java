package com.laislodi.hackerrank.string.bracket;

public class Bracket {

    private Bracket() {
    }

    public static Boolean isOpening(Character expression) {
        return expression.equals('(') || expression.equals('[') ||expression.equals('{');
    }

    public static Boolean isClosing(Character expression) {
        return expression.equals(')') || expression.equals(']') ||expression.equals('}');
    }

    public static Boolean sameType(Character open, Character close) {
        return (open.equals('(') && close.equals(')')) ||
                (open.equals('[') && close.equals(']')) ||
                (open.equals('{') && close.equals('}'));
    }
}
