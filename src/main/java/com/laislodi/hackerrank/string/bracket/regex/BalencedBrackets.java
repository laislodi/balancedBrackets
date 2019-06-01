package com.laislodi.hackerrank.string.bracket.regex;

import com.laislodi.hackerrank.string.bracket.Bracket;

public class BalencedBrackets {

    public Boolean isBalenced(String expression) {
        String cleanExpression = removeAllExcept(expression);

        return removeInternalPair(cleanExpression).isEmpty();
    }

    private String removeInternalPair(String expression) {
        StringBuilder stringBuilder = new StringBuilder(expression);
        for (int i = 1 ; i < stringBuilder.length(); i++) {
            Character charBefore = stringBuilder.charAt(i - 1);
            Character charAt = stringBuilder.charAt(i);
            if ((Bracket.isOpening(charBefore) && Bracket.isClosing(charAt) &&
                    Bracket.sameType(charBefore, charAt))) {
                stringBuilder.replace(i-1, i+1, "");
                i = 0;
            }
        }
        return stringBuilder.toString();
    }

    private String removeAllExcept2(String expression, String doNotRemove) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            String charAt = String.valueOf(expression.charAt(i));
            if (doNotRemove.contains(charAt)) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }

    private String removeAllExcept(String expression) {
        return expression.replaceAll("[^\\[\\]\\{\\}\\(\\)]", "");
    }
}
