package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Collections;
import java.util.Scanner;

/**
 * 8/30/2018
 *
 * @author Mohammad Ali
 */
public class Staircase {

    // Complete the staircase function below.
    static void staircase(int n) {
        for (int i = 1; i <= n; i++) {
            String str = String.join("", Collections.nCopies(i, "#"));
            System.out.println(String.format("%" + n + "s", str));
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }

}
