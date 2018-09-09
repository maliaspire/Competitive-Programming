package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaStaticInitializerBlock {

    private static int B;
    private static int H;
    private static boolean flag;

    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        H = scanner.nextInt();
        flag = B > 0 && H > 0;
        if (!flag) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }

    }//end of main

}//end of class
