package com.mxninja.competitiveProgramming.hackerrank;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

/**
 * 9/9/2018
 *
 * @author Mohammad Ali
 */
public class JavaDateAndTime {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }

    private static String getDay(String day, String month, String year) {
        LocalDate date = LocalDate.parse(year + "-" + month + "-" + day);
        return date.format(DateTimeFormatter.ofPattern("EEEE")).toUpperCase();
    }
}
