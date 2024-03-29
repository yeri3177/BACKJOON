package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 5.평균
 * https://www.acmicpc.net/problem/1546
 * 
 * 메모리    시간
 * 14428	140
 */
//public class Bronze1_1546 {
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int cnt = Integer.parseInt(br.readLine());
//
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int[] score = new int[cnt];
//        int i = 0;
//        while (st.hasMoreTokens()) {
//            score[i++] = Integer.parseInt(st.nextToken());
//        }
//
//        double max = Arrays.stream(score).max().getAsInt();
//        double sum = 0;
//        for (int sco : score) {
//            sum += sco/max*100;
//        }
//
//        System.out.println(sum/cnt);
//    }
//}

/**
 *  메모리    시간
 * 	14340	132
 */
public class Bronze1_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        double max = 0, sum = 0;

        while (st.hasMoreTokens()) {
            int score = Integer.parseInt(st.nextToken());
            max = Math.max(max, score);
            sum += score;
        }

        System.out.println((sum/max*100)/cnt);
    }
}