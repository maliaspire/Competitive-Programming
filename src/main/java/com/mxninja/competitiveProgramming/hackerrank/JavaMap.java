package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaMap {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfNames = Integer.parseInt(reader.readLine());
        Map<String, String> phoneBook = new LinkedHashMap<>();
        for (int i = 0; i < numberOfNames; i++) {
            phoneBook.put(
                    reader.readLine(),
                    reader.readLine()
            );
        }
        String name;
        while ((name = reader.readLine()) != null){
            String phone = phoneBook.get(name);
            if (phone == null) {
                System.out.println("Not found");
                continue;
            }
            System.out.println(String.format("%s=%s", name, phone));
        }

    }

}
