package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaOutputFormatting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.println(String.format("%-15s%03d", s1, x));
        }
        System.out.println("================================");

    }

}
