package com.mxninja.competitiveProgramming.hackerrank;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 8/30/2018
 *
 * @author Mohammad Ali
 */
public class PlusMinus {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        int plusCount = 0;
        int minusCount = 0;
        int zeroCount = 0;

        for (int value : arr) {
            if (value == 0) {
                zeroCount++;
            } else if (value > 0) {
                plusCount++;
            } else {
                minusCount++;
            }
        }

        int length = arr.length;
        DecimalFormat format = new DecimalFormat("0.000000");
        System.out.println(format.format((double) plusCount / length));
        System.out.println(format.format((double) minusCount / length));
        System.out.println(format.format((double) zeroCount / length));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }

}
