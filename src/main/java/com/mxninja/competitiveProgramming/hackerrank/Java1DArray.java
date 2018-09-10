package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class Java1DArray {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}
