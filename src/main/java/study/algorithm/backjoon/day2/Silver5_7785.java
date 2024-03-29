package study.algorithm.backjoon.day2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 6.회사에 있는 사람
 * https://www.acmicpc.net/problem/7785
 * 
 * 메모리    시간
 * 55516	1552
 */
public class Silver5_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashSet<String> set = new HashSet<>();
        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String status = st.nextToken();

            if("enter".equals(status)){
                set.add(name);
            } else if ("leave".equals(status)) {
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<String>(set);
        Collections.sort(list, Collections.reverseOrder());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        br.close();
    }
}
