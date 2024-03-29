package study.algorithm.backjoon.day2;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 1.단어의 개수
 * https://www.acmicpc.net/problem/1152
 *
 * 메모리    시간
 * 25300	308
 */
public class Bronze2_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();
        int cnt = 0;
        while (st.hasMoreTokens()) {
            st.nextToken();
            cnt++;
        }
        bw.write(String.valueOf(cnt));
        bw.flush();
        bw.close();
    }
}
