package com.practice;

import java.util.Scanner;
import java.util.Stack;

public class Brackets {
    private static char[][] TOKENS = {{'{', '}'},{'(',')'},{'[',']'}};

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        while (true) {
            String expression = s.next();
            if ("exit".equals(expression)) {
                break;
            }
            System.out.println(isBalanced(expression));
        }
    }

    private static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();
        for (char c: expression.toCharArray()) {
            if (isOpenTerm(c)) {
                stack.add(c);
            } else {
                if (stack.isEmpty() || !isMatching(stack.pop(), c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private static boolean isMatching(char openTerm, char closedTerm) {
        for (char[] array: TOKENS) {
            if (array[0] == openTerm) {
                return array[1] == closedTerm;
            }
        }
        return false;
    }

    private static boolean isOpenTerm(char c) {
        for (char[] array: TOKENS) {
            if (array[0] == c) {
                return true;
            }
        }
        return false;
    }
}
