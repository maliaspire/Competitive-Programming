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
public class JavaArraylist {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberOfList = Integer.parseInt(reader.readLine());
        StringTokenizer tokenizer;
        ArrayList<Integer>[] arrayLists = new ArrayList[numberOfList];
        for (int i = 0; i < numberOfList; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int numberOfElements = Integer.parseInt(tokenizer.nextToken());
            arrayLists[i] = new ArrayList<>();
            for (int j = 0; j < numberOfElements; j++) {
                arrayLists[i].add(Integer.parseInt(tokenizer.nextToken()));
            }
        }
        int numberOfQueries = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numberOfQueries; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            int listNumber = Integer.parseInt(tokenizer.nextToken()) - 1;
            int elementPosition = Integer.parseInt(tokenizer.nextToken()) - 1;
            if (elementPosition + 1 > arrayLists[listNumber].size()) {
                System.out.println("ERROR!");
                continue;
            }
            System.out.println(arrayLists[listNumber].get(elementPosition));
        }

    }

}
