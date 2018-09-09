package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaStringsIntroduction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        System.out.println(firstUpper(A) + " " + firstUpper(B));

    }

    private static String firstUpper(String str) {
        char[] a = str.toCharArray();
        a[0] = Character.toUpperCase(a[0]);
        return String.valueOf(a);
    }

}
