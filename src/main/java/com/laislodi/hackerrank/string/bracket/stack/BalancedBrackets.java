package com.laislodi.hackerrank.string.bracket.stack;

import com.laislodi.hackerrank.string.bracket.Bracket;

import java.util.Stack;

public class BalancedBrackets {

    public Boolean isBalenced(String expression) {
        Stack<Character> stack = new Stack<>();

        for (Character chatAt : expression.toCharArray()) {
            if (Bracket.isOpening(chatAt)) {
                stack.push(chatAt);
            } else if (Bracket.isClosing(chatAt) && !stack.isEmpty()
                    && Bracket.sameType(stack.peek(), chatAt)) {
                stack.pop();
            } else if (Bracket.isClosing(chatAt)) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
