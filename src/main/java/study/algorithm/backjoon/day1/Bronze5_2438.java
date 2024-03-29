package study.algorithm.backjoon.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * 1.별 찍기 - 1
 * https://www.acmicpc.net/problem/11111
 * 
 * 메모리    시간
 * 14248	132
 */
public class Bronze5_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for(int row=1; row<=n; row++){
            for(int column=1; column<=row; column++){
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

/**
 * 메모리    시간
 * 18140	372
 */
//class Main {
//    public static void main(String[] args) throws IOException {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            int n = sc.nextInt();
//
//            for(int row=1; row<=n; row++){
//                for(int column=1; column<=row; column++){
//                    System.out.print("*");
//                }
//                System.out.println();
//            }
//        }
//    }
//}
