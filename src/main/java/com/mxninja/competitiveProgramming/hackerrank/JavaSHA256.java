package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaSHA256 {

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        MessageDigest digest = MessageDigest.getInstance("MD5");
        byte[] hash = digest.digest(line.getBytes(StandardCharsets.UTF_8));
        for (byte b : hash) {
            System.out.printf("%02x", b);
        }

    }

}
