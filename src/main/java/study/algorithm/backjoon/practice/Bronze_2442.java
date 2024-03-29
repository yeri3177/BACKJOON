package study.algorithm.backjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 별 찍기 - 5
 * https://www.acmicpc.net/problem/2442
 *
 * 입력 : 5
 * 출력 :
 * 4, 1
 * 3, 3
 * 2, 5
 * 1, 7
 * 0, 9
 *
 * 1~num > 1~num-i, 1~2*i-1
 */
public class Bronze_2442 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num-i; j++) {
                sb.append(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
