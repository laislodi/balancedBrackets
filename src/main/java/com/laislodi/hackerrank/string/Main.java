package com.laislodi.hackerrank.string;

import com.laislodi.hackerrank.string.bracket.BalencedBrackets;

public class Main {

    public static void main(String[] args) {
        BalencedBrackets balencedBrackets = new BalencedBrackets("(u)(3((a)(v))(t(2)))");

        String removeAllExcept = balencedBrackets.removeAllExcept("()");
        System.out.println("removeAllExcept" + removeAllExcept);

        String removeInternalPair = balencedBrackets.removeInternalPair(removeAllExcept);
        System.out.println("removeInternalPair" + removeInternalPair);

        BalencedBrackets balencedBrackets1 = new BalencedBrackets("()[()]{[()()]}");
        System.out.println("Are the brackets balenced? " + balencedBrackets1.getExpression() + balencedBrackets1.isBalenced());

    }
}
