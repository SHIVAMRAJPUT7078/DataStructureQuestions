package LongestCommonSubsequence;

import java.util.Arrays;
import java.util.Scanner;

public class LCS {
    public static int helper(String s1, String s2, int n, int m, int[][] dp) {
//        return 0;
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {

            return 1 + helper(s1, s2, n - 1, m - 1, dp);
        }
        int in = helper(s1, s2, n - 1, m, dp);
        int ex = helper(s1, s2, n, m - 1, dp);

        return (Math.max(in, ex));


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String text1 = sc.nextLine();//abcde
//        String text2 = sc.nextLine();//ace
        String text1 = "aec";
        String text2 = "ace";
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(helper(text1, text2, text1.length(), text2.length(), dp));
    }
}

