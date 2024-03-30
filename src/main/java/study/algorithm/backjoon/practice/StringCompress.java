package study.algorithm.backjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 문자열에서 반복되는 문자를 숫자로 표현하여 압축하는 것입니다.
 * 예를 들어, "aaabbcccc"는 "a3b2c4"로 압축됩니다.
 */
public class StringCompress {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(compress(str));
    }

    public static String compress(String str) {
        StringBuilder compressed = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            char cur = str.charAt(i);
            if(i == str.length() - 1) {
                compressed.append(cur).append(count);
                count = 1;
                continue;
            }
            char next = str.charAt(i+1);
            if(next != cur) {
                compressed.append(cur).append(count);
                count = 1;
                continue;
            }
            count++;
        }
        return compressed.toString();
    }
}
