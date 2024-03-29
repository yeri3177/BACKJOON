package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4.단어 공부
 * https://www.acmicpc.net/problem/1157
 * 
 * 메모리    시간
 * 21100	280
 */
public class Bronze1_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine().toUpperCase();

        int[] alphabet = new int[26];
        int strLength = str.length();

        for (int i = 0; i < strLength; i++) {
            alphabet[str.charAt(i)-'A']++;
        }

        int max = Integer.MIN_VALUE;
        int count = 0;
        int index = -1;

        for (int i = 0; i < 26; i++) {
            if(alphabet[i] == 0) continue;

            if (max < alphabet[i]) {
                max = alphabet[i];
                index = i;
                count = 1;
            } else if (max == alphabet[i]) {
                count++;
            }
        }

        if(count > 1){
            System.out.println("?");
        }else{
            System.out.println((char)(index+'A'));
        }
    }
}

/**
 * 4.단어 공부
 * https://www.acmicpc.net/problem/1157
 *
 * 메모리    시간
 * 21092	288
 */
//public class Bronze1_1157 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String str = br.readLine().toUpperCase();
//
//        int[] alphabet = new int[26];
//
//        for (int i = 0; i < str.length(); i++) {
//            alphabet[str.charAt(i)-'A'] += 1;
//        }
//
//        int max = Arrays.stream(alphabet).max().getAsInt();
//        int count = 0;
//        int index = -1;
//
//        for (int i = 0; i < alphabet.length; i++) {
//            if(alphabet[i] == max) {
//                count++;
//                index = i;
//            }
//        }
//
//        if(count > 1){
//            System.out.println("?");
//        }else{
//            System.out.println((char)(index+'A'));
//        }
//    }
//}
