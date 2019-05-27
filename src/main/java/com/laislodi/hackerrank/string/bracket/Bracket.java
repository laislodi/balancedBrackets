package com.laislodi.hackerrank.string.bracket;

public enum Bracket {

    LEFT_PARENTHESIS("("),
    RIGHT_PARENTHESIS(")"),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    LEFT_CURLY_BRACKET("{"),
    RIGHT_CURLY_BRACKET("}");

    private Bracket(String bracket) {

    }

    public static Boolean isBracket(String expression) {
        return  expression.length() == 1 && "()[]{}".contains(expression);
    }

    public static Boolean isOpening(String expression) {
        return expression.length() == 1 && "([{".contains(expression);
    }

    public static Boolean isClosing(String expression) {
        return expression.length() == 1 && ")]}".contains(expression);
    }

    public static String allBrackets() {
        return "()[]{}";
    }

    public static String[] allPairs() {
        return new String[]{"()", "[]", "{}"};
    }

    public static Boolean sameType(String open, String close) {
        return (open.equals("(") && close.equals(")")) ||
                (open.equals("[") && close.equals("]")) ||
                (open.equals("{") && close.equals("}"));
    }
}
