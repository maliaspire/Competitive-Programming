package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaList {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfElements = Integer.parseInt(reader.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        for (int i = 0; i < numberOfElements; i++) {
            list.add(Integer.parseInt(tokenizer.nextToken()));
        }
        int numberOfQueries = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfQueries; i++) {
            String command = reader.readLine().toLowerCase();
            tokenizer = new StringTokenizer(reader.readLine());
            int position = Integer.parseInt(tokenizer.nextToken());
            if (command.startsWith("i")) {
                int element = Integer.parseInt(tokenizer.nextToken());
                list.add(position, element);
            } else {
                list.remove(position);
            }
        }
        list.forEach(element -> System.out.print(element + " "));
    }

}
