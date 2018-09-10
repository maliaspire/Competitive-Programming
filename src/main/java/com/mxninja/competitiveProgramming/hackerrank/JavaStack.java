package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;
import java.util.Stack;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            if (input.isEmpty()) {
                System.out.println(true);
                continue;
            }
            Stack<Character> stack = new Stack<>();
            char[] chars = input.toCharArray();
            boolean flag = true;
            for (char c : chars) {
                switch (c) {
                    case ')':
                    case ']':
                    case '}':
                        if (stack.isEmpty()) {
                            flag = false;
                            break;
                        }
                        char head = stack.peek();

                        if (head == '(' && c == ')') {
                            stack.pop();
                        } else if (head == '[' && c == ']') {
                            stack.pop();
                        } else if (head == '{' && c == '}') {
                            stack.pop();
                        } else {
                            flag = false;
                            break;
                        }
                        break;
                    case '(':
                        stack.push(c);
                        break;
                    case '[':
                        stack.push(c);
                        break;
                    case '{':
                        stack.push(c);
                        break;
                }
            }
            System.out.println(flag && stack.isEmpty());

        }

    }

}
