package study.algorithm.backjoon.day3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 4.N과 M (1)
 * https://www.acmicpc.net/problem/15649
 * 
 * 메모리    시간
 * 23280	264
 */
public class Silver3_15649 {
    static int N;
    static int M;
    static boolean[] check;
    static int[] nums;
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        sb = new StringBuilder();
        check = new boolean[N];
        nums = new int[M];
        dfs(0);
        System.out.println(sb);
    }

    public static void dfs(int depth){
        if (depth == M) {
            for (int val : nums) {
                sb.append(val).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < N; i++) {
            if (!check[i]) {
                check[i] = true;
                nums[depth] = i+1;
                dfs(depth+1);
                check[i] = false;
            }
        }
    }
}
