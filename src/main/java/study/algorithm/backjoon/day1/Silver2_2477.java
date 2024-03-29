package study.algorithm.backjoon.day1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 8.참외밭
 * https://www.acmicpc.net/problem/2477
 * 
 * 메모리    시간
 *
 *
 * ★ 아이디어
 * 길이의 가로 최대값, 세로 최대값 구하기 -> 큰 사각형 넓이 구하기
 * 가로 최대길이 옆 세로 최대길이 옆 가로길이를 찾기 -> 가로 최대길이 - 구한 가로길이 = 작은 사각형 가로 길이
 * 세로 최대길이 옆 가로 최대길이 옆 가로길이를 찾기 -> 세로 최대길이 - 구한 세로길이 = 작은 사각형 세로 길이
 */
public class Silver2_2477 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); // 넓이당 수박 개수
        StringTokenizer st;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());


        }

        br.close();
    }
}
