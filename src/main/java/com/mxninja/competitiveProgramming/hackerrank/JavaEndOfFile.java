package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaEndOfFile {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int linesCounter = 0;
        while ((line = reader.readLine()) != null) {
            System.out.println(String.format("%d %s", ++linesCounter, line));
        }
    }

}
