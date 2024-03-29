package study.algorithm.backjoon.practice;

import java.io.IOException;
import java.util.Scanner;

/**
 * 체스판 다시 칠하기
 * https://www.acmicpc.net/problem/1018
 * 
 * 메모리    시간
 * 17860	264
 */
public class Silver_1018 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        boolean[][] matrix = new boolean[N + 100][M + 100];

        for (int i = 0; i < N; i++) {
            String str = sc.next();

            for (int j = 0; j < M; j++) {
                matrix[i][j] = ((str.charAt(j)) == 'W');
            }
        }

        int chessRow = N - 7;
        int chessColumn = M - 7;
        int answer = 64;

        for (int i = 0; i < chessRow; i++) {
            for (int j = 0; j < chessColumn; j++) {
                // 최소값 구하기
                answer = Math.min(answer, solve(matrix, i, j));
            }
        }

        System.out.println(answer);
    }

    public static int solve(boolean[][] matrix, int x, int y) {
        int chessX = x + 8;
        int chessY = y + 8;
        int count = 0;

        boolean curColor = matrix[x][y];

        for (int i = x; i < chessX; i++) {
            for (int j = y; j < chessY; j++) {
                if (matrix[i][j] != curColor) {
                    count++;
                }
                curColor = (!curColor);
            }
            curColor = (!curColor);
        }
        return Math.min(count, 64 - count);
    }
}
