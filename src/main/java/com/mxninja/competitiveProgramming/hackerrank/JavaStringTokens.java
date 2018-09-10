package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaStringTokens {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        if(s.trim().isEmpty()){
            System.out.println(0);
            return;
        }
        String[] sp = s.trim().split("[!,?._'@\\s]+");
        System.out.println(sp.length);
        for (String str : sp) {
            System.out.println(str);
        }
        scan.close();
    }

}
