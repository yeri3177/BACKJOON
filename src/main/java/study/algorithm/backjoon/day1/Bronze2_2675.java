package study.algorithm.backjoon.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 3.문자열 반복
 * https://www.acmicpc.net/problem/2675
 *
 * 메모리    시간
 * 13972	116
 */
 public class Bronze2_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        for (int i = 0; i < N; i++) { // 단어입력
            st = new StringTokenizer(br.readLine());
            int cnt = Integer.parseInt(st.nextToken());
            String str = st.nextToken();

            for (int j = 0; j < str.length(); j++) { // 문자길이
                int count = 0;

                while (count < cnt) { // 반복횟수
                    sb.append(str.charAt(j));
                    count++;
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
 }

 /**
 * 메모리    시간
 * 17576	240
 */
//public class Bronze2_2675 {
//    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//
//        int count = sc.nextInt();
//        sc.nextLine();
//
//        String[] arr = new String[count];
//
//        for (int i = 0; i < count; i++) {
//            arr[i] = sc.nextLine();
//        }
//        solution(arr);
//    }
//
//    public static void solution(String[] arr){
//
//        for(int i=0; i<arr.length; i++){
//            int cnt = Integer.valueOf(arr[i].substring(0, 1)); // 반복 횟수
//            String str = arr[i].substring(2); // 문자열
//
//            for (int j = 0; j < str.length(); j++) {
//
//                for (int k = 0; k < cnt; k++) {
//                    System.out.print(str.charAt(j));
//                }
//
//            }
//            System.out.println();
//        }
//    }
//}
