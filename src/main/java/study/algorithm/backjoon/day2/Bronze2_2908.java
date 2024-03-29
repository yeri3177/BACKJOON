package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1.상수
 * https://www.acmicpc.net/problem/2908
 *
 * 메모리    시간
 * 14208	136
 */
//public class Bronze2_2908 {
//
//    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int N = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//        int M = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//
//        System.out.println(Math.max(N, M));
//    }
//}

/**
 * 3.상수
 * https://www.acmicpc.net/problem/2908
 *
 * 메모리    시간
 * 14140	124
 */
public class Bronze2_2908 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(Math.max(strReverseToInt(st.nextToken()), strReverseToInt(st.nextToken())));
    }

    static int strReverseToInt(String str){
        return Integer.parseInt(new StringBuilder(str).reverse().toString());
    }
}