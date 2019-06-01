package com.laislodi.hackerrank.string.bracket.stack;

public class Main {

    public static void main(String[] args) {
        BalancedBrackets balancedBrackets = new BalancedBrackets();

        String expression = "(u)(3((a)(v))(t(2)))";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));

        expression = "()[()]{[()()]}";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));

        expression = "(aaaa)7[(g)r]{sdf[(ui)()i]y}a";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));

        expression = "(aaaa]7[(g)r]{sdf[(ui)()i]y}a";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));

        expression = "7[(g})r]{sdf[(ui)()i]y}a";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));

        expression = "{{{}}}}}";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));

        expression = "{{]]";
        System.out.println("Are the brackets balenced? " + expression + " " + balancedBrackets.isBalenced(expression));
    }
}
