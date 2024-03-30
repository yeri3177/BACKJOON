package study.algorithm.backjoon.day4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 5.팰린드롬 만들기
 * https://www.acmicpc.net/problem/1213
 * 
 * 메모리    시간
 * 14308	124
 *
 * "주어진것"
 * 입력값은 영어 대문자, 최대 50글자
 * 알파벳순으로 나열할것 > AABCBAA
 *
 * "아이디어"
 * 알파벳은 총 26가지 > int[26]
 * 홀수 알파벳은 0~1개여야한다. 1초과면 false
 * 홀수 알파벳은 가운데에 위치할 것
 */
public class Silver3_1213 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int[] alphabet = new int[26];
        for (char ch : word.toCharArray()) {
            int idx = ch-'A';
            alphabet[idx]++;
        }

        StringBuilder sb = new StringBuilder();
        int odd = 0;
        char temp = ' ';

        for (int i = 0; i < 26; i++) {
            int cnt = alphabet[i];
            if(cnt == 0) continue;
            if(cnt%2 != 0) { // 홀수이면
                temp = (char)(i+'A');
                odd++;

            }
            for (int j = 0; j < cnt/2; j++) {
                sb.append((char)(i+'A'));
            }
        }

        if(odd>1){
            System.out.println("I'm Sorry Hansoo");
            return;
        }

        StringBuilder tempSb = new StringBuilder(sb).reverse();
        if(temp != ' ') sb.append(temp);
        sb.append(tempSb);
        System.out.println(sb);
        br.close();
    }
}
