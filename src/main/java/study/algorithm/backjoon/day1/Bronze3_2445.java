package study.algorithm.backjoon.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 4.별 찍기 - 8
 * https://www.acmicpc.net/problem/2445
 * 
 * 메모리    시간
 * 14500	140
 *
 * 아이디어
 * 입력 : 5 <- row는 1부터 2*입력값-1까지
 * 1 8 1 <- i=1, j=2*N-2*i
 * 2 6 2 <- i=2. j=2*5-2*2
 * 3 4 3
 * 4 2 4
 * 5 0 5 <- 입력값-1일때 절반
 * 4 2 4
 * .....
 */
public class Bronze3_2445 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        br.close();
        StringBuilder sb = new StringBuilder();
        int length;

        for (int row = 1, change = 1; row <= 2*N-1; row++) {
            length = (N-change)*2;

            for (int starLeft = 0; starLeft < change; starLeft++) {
                sb.append("*");
            }
            for (int blank = 0; blank < length; blank++) {
                sb.append(" ");
            }
            for (int starRight = 0; starRight < change; starRight++) {
                sb.append("*");
            }

            if(row < N) change++;
            else change--;
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

/**
 * 메모리    시간
 * 24344	548
 */
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt();
//        solution(count);
//    }
//
//    public static void solution(int count){
//        // 1~5줄
//        for (int i = 1; i <= count; i++) {
//            for (int a = 1; a <= i; a++) {
//                System.out.print("*");
//            }
//
//            for (int b = 1; b <= 2*(count-i); b++) {
//                System.out.print(" ");
//            }
//            for (int a = 1; a <= i; a++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//        // 6~10줄
//        for (int i = 1; i < count; i++) {
//            for (int a = count-1; a >= i; a--) {
//                System.out.print("*");
//            }
//            for (int b = 1; b <= 2*i; b++) {
//                System.out.print(" ");
//            }
//            for (int a = count-1; a >= i; a--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}
