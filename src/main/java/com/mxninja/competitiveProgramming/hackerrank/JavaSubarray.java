package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaSubarray {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int arraySize = Integer.parseInt(reader.readLine());
        int[] a = new int[arraySize];
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());

        for (int i = 0; i < arraySize; i++) {
            a[i] = Integer.parseInt(tokenizer.nextToken());
        }
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            int subSum = 0;
            for (int j = i; j < a.length; j++) {
                subSum += a[j];
                if (subSum < 0) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }

}
