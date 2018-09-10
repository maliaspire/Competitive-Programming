package com.mxninja.competitiveProgramming.hackerrank;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaRegex2DuplicateWords {

    public static void main(String[] args) {

        String regex = "\\b(\\w+)\\b\\s*(?=.*\\b\\1\\b)";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll("(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+", "$1");
            }

            // Prints the modified sentence.
            System.out.println(input);
        }

        in.close();
    }

}
