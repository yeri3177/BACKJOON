package study.algorithm.backjoon.practice;

/**
 * 문자열의 모든 순열 찾기
 * 주어진 문자열의 모든 가능한 순열을 생성하는 것입니다.
 * 예를 들어, "abc"의 순열은 "abc", "acb", "bac", "bca", "cab", "cba"입니다.
 */
public class StringPermutations {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n-1);
    }

    public static void permute(String str, int l, int r) {
        if (l == r) {
            System.out.println(str);
        } else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, i);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public static String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
