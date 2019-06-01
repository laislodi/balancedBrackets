package com.laislodi.hackerrank.string.bracket.regex;

import com.laislodi.hackerrank.string.bracket.regex.BalencedBrackets;

public class Main {

    public static void main(String[] args) {
        BalencedBrackets balencedBrackets1 = new BalencedBrackets();

        String expression = "(u)(3((a)(v))(t(2)))";
        System.out.println("Are the brackets balenced? " + expression + " " + balencedBrackets1.isBalenced(expression));

        expression = "()[()]{[()()]}";
        System.out.println("Are the brackets balenced? " + expression + " " + balencedBrackets1.isBalenced(expression));

        expression = "(aaaa)7[(g)r]{sdf[(ui)()i]y}a";
        System.out.println("Are the brackets balenced? " + expression + " " + balencedBrackets1.isBalenced(expression));

        System.out.println(expression.replaceAll("[^\\[\\]\\{\\}\\(\\)]", ""));
    }
}
