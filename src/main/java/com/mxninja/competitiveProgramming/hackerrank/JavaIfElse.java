package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaIfElse {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        /*If  is odd, print Weird
If  is even and in the inclusive range 2 of 5 to , print Not Weird
If  is even and in the inclusive range of 6 to 20 , print Weird
If  is even and greater than , print Not Weird*/
        if (N % 2 != 0) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 2 <= N && N <= 5) {
            System.out.println("Not Weird");
        } else if (N % 2 == 0 && 6 <= N && N <= 20) {
            System.out.println("Weird");
        } else if (N % 2 == 0 && 20 < N) {
            System.out.println("Not Weird");
        } else {
            System.out.println("Not Weird");
        }
        scanner.close();
    }

}
