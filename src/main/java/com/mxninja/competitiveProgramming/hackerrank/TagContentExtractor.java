package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class TagContentExtractor {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(reader.readLine());
        for (int i = 0; i < t; i++) {
            Stack<String> stack = new Stack<>();
            char[] chars = reader.readLine().toCharArray();
            StringBuilder line = new StringBuilder();
            boolean valid = true;
            label:
            for (int cIndex = 0; cIndex < chars.length; cIndex++) {
                char c = chars[cIndex];
                if (c == '<') {
                    StringBuilder tag = new StringBuilder();
                    boolean isEndTagFlag = false;
                    for (int p = cIndex + 1; p < chars.length; p++) {
                        if (chars[p] == '>') {
                            cIndex = p;
                            break;
                        } else if (chars[p] == '/') {
                            isEndTagFlag = true;
                            continue;
                        }
                        tag.append(chars[p]);
                    }
                    if (isEndTagFlag) {
                        String head = stack.peek();
                        if (!head.equals(tag.toString())) {
                            valid = false;
                            break label;
                        } else {
                            stack.pop();
                            if (!stack.isEmpty()) {
                                line.append(line.toString());
                            }
                        }
                    } else {
                        stack.push(tag.toString());
                    }
                } else {
                    line.append(c);
                }
            }
            if (valid) {
                System.out.println(line.toString());
            } else {
                System.out.println("None");
            }
        }
    }

}
