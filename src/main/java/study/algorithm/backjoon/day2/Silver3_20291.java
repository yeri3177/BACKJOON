package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 7.파일 정리
 * https://www.acmicpc.net/problem/20291
 * 
 * 메모리    시간
 * 57280	1612
 */
public class Silver3_20291 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), ".");
            st.nextToken();
            String ext = st.nextToken();

            map.put(ext, map.getOrDefault(ext, 0) + 1);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " " + map.get(list.get(i)));
        }

        br.close();
    }
}
