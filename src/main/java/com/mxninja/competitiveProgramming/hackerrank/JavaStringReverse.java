package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaStringReverse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        int inc = A.length() % 2 == 0 ? 0 : 1;
        String f = A.substring(0, A.length() / 2);
        String l = new StringBuilder(A.substring(A.length() / 2 + inc)).reverse().toString();
        System.out.println(f.equals(l) ? "Yes" : "No");

    }

}
