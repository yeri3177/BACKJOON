package study.algorithm.backjoon.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 * 2.주사위 세개
 * https://www.acmicpc.net/problem/2480
 * 
 * 메모리    시간
 * 17688	208
 */
//public class Bronze4_2480 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//
//        System.out.println(solution(a,b,c));
//    }
//
//    public static int solution(int a, int b, int c){
//        if(a == b && b == c){
//            return  10000 + a*1000;
//        }else if(a == b || b == c || a == c){
//            return 1000 + (a==b?a:c)*100;
//        }else{
//            return Math.max(a,Math.max(b,c))*100;
//        }
//    }
//}

/**
 * 메모리    시간
 * 14160	132
 */
public class Bronze4_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        if(A == B && B == C){
            System.out.println(10000 + A*1000);
        }else if(A == B || B == C || A == C){
            System.out.println(1000 + (A == B ? A : C) * 100);
        }else{
            System.out.println(Math.max(A, Math.max(B, C))*100);
        }
    }
}
