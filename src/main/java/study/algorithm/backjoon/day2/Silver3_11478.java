package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

/**
 * 8.서로 다른 부분 문자열의 개수
 * https://www.acmicpc.net/problem/11478
 * 
 * 메모리    시간
 * 226972	728
 */
public class Silver3_11478 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                set.add(str.substring(i, j));
            }
        }

        System.out.println(set.size());

        br.close();
    }
}
