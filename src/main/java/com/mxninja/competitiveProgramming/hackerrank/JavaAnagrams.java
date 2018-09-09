package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaAnagrams {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }

    static boolean isAnagram(String a, String b) {
        return returnHashcode(a) == returnHashcode(b);
    }

    private static int returnHashcode(String str) {
        char[] a = str.toLowerCase().toCharArray();
        Arrays.sort(a);
        return Arrays.hashCode(a);
    }
}
