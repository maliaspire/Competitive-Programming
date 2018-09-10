package com.mxninja.competitiveProgramming.hackerrank;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaPrimalityTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String n = scanner.nextLine();
        BigInteger integer = new BigInteger(n);
        System.out.println(integer.isProbablePrime(100) ? "prime" : "not prime");
        scanner.close();
    }

}
