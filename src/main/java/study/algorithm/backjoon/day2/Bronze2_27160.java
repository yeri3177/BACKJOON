package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * 2.할리갈리
 * https://www.acmicpc.net/problem/27160
 * 
 * 메모리    시간
 * 40044	436
 */
public class Bronze2_27160 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String fruit = st.nextToken();
            int cnt = Integer.parseInt(st.nextToken());

            map.put(fruit, map.getOrDefault(fruit, 0)+cnt);
        }

        boolean status = false;

        for (String key : map.keySet()) {
            if (map.get(key) == 5) {
                status = true;
            }
        }
        System.out.println(status?"YES":"NO");
        br.close();
    }
}
