package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaExceptionHandlingTryCatch {

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int a = Integer.parseInt(reader.readLine());
            int b = Integer.parseInt(reader.readLine());
            System.out.println(a / b);
        } catch (InputMismatchException e) {

        } catch (ArithmeticException e){
            System.out.println("java.lang.ArithmeticException: / by zero");
        } catch (Exception e){
            System.out.println("java.util.InputMismatchException");
        }
    }

}
