package study.algorithm.backjoon.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 6.추월
 * https://www.acmicpc.net/problem/2002
 * 
 * 메모리    시간
 * 15548	200
 */
public class Silver1_2002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            map.put(br.readLine(), i);
        }

        int count = 0;

        for (int i = 0; i < N; i++) {
            String car = br.readLine();

            Iterator<String> iterator = map.keySet().iterator();
            while(iterator.hasNext()){
                if(map.get(car) > map.get(iterator.next())){
                    count++;
                    break;
                }
            }
            map.remove(car);
        }

        System.out.println(count);
        br.close();
    }
}
