package com.mxninja.competitiveProgramming.hackerrank;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 8/30/2018
 *
 * @author Mohammad Ali
 */
public class MiniMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
        Arrays.sort(arr);
        BigInteger mid = new BigInteger(String.valueOf(arr[1]));
        mid = mid.add(new BigInteger(String.valueOf(arr[2])));
        mid = mid.add(new BigInteger(String.valueOf(arr[3])));
        System.out.println(mid.add(new BigInteger(String.valueOf(arr[0]))) + " " + mid.add(new BigInteger(String.valueOf(arr[4]))));

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }

}
