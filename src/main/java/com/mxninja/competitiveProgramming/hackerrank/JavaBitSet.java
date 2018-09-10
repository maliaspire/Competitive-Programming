package com.mxninja.competitiveProgramming.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;
import java.util.StringTokenizer;

/**
 * 9/10/2018
 *
 * @author Mohammad Ali
 */
public class JavaBitSet {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tokenizer = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(tokenizer.nextToken());
        int m = Integer.parseInt(tokenizer.nextToken());
        BitSet[] sets = new BitSet[]{null, new BitSet(n), new BitSet(n)};
        for (int i = 0; i < m; i++) {
            tokenizer = new StringTokenizer(reader.readLine());
            String operation = tokenizer.nextToken();
            int a = Integer.parseInt(tokenizer.nextToken());
            int b = Integer.parseInt(tokenizer.nextToken());
            switch (operation) {
                case "AND": {
                    sets[a].and(sets[b]);
                }
                break;
                case "OR": {
                    sets[a].or(sets[b]);
                }
                break;
                case "XOR": {
                    sets[a].xor(sets[b]);
                }
                break;
                case "FLIP": {
                    sets[a].flip(b);
                }
                break;
                case "SET": {
                    sets[a].set(b);
                }
                break;
            }
            System.out.print(String.format("%d %d\n", sets[1].cardinality(), sets[2].cardinality()));
        }

    }

}
