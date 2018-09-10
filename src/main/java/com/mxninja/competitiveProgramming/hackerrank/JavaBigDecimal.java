package com.mxninja.competitiveProgramming.hackerrank;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaBigDecimal {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();
        String[] s2 = new String[n];
        System.arraycopy(s, 0, s2, 0, s2.length);
        Arrays.sort(s2, Collections.reverseOrder((a1, a2) -> {
            //convert to big decimal inside comparator
            //so permanent string values are never changed
            //aka you only use the BigDecimal values to
            //compare the strings!
            BigDecimal a = new BigDecimal(a1);
            BigDecimal b = new BigDecimal(a2);
            return a.compareTo(b);
        }));
        System.arraycopy(s2, 0, s, 0, s2.length);
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
