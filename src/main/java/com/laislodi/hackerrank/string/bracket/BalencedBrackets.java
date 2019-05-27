package com.laislodi.hackerrank.string.bracket;

import java.util.ArrayList;
import java.util.List;

public class BalencedBrackets {

    private String expression;

    public BalencedBrackets(String expression) {
        this.expression = expression;
    }

    public String getExpression() {
        return expression;
    }

    public Boolean isBalenced() {
        this.expression = removeAllExcept(Bracket.allBrackets());

        return removeInternalPair(expression).isEmpty();
    }

    public String removeInternalPair(String expression) {
        StringBuilder stringBuilder = new StringBuilder(expression);
        //int j = 0;
        for (int i = 1 ; i < stringBuilder.length(); i++) {
            String charBefore = String.valueOf(stringBuilder.charAt(i - 1));
            String charAt = String.valueOf(stringBuilder.charAt(i));
            if ((Bracket.isOpening(charBefore) && Bracket.isClosing(charAt) &&
                    Bracket.sameType(charBefore, charAt))) {
                // ()(()())()    (){[][()]}()
                stringBuilder.replace(i-1, i+1, "");
                //System.out.println(stringBuilder);
                i = 0;
            }
        }
        return stringBuilder.toString();
    }

    public String removeAllExcept(String doNotRemove) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < expression.length(); i++) {
            String charAt = String.valueOf(expression.charAt(i));
            if (doNotRemove.contains(charAt)) {
                stringBuilder.append(charAt);
            }
        }
        return stringBuilder.toString();
    }
}
