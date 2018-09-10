package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaBigInteger {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(reader.readLine());
        BigInteger b = new BigInteger(reader.readLine());
        BigInteger c = a.add(b);
        BigInteger d = a.multiply(b);
        System.out.println(c);
        System.out.println(d);
    }

}
