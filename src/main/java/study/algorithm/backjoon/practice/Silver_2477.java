package study.algorithm.backjoon.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Silver_2477 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.valueOf(br.readLine()); // 넓이당 참외개수

        StringTokenizer st;
        int maxW = 0, maxH = 0;

        for (int i = 0; i < 6; i++) {
            st = new StringTokenizer(br.readLine());
            int direction = Integer.parseInt(st.nextToken());
            int length = Integer.parseInt(st.nextToken());
        }
    }
}
