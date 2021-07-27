package LongestCommonSubsequence;

import java.util.Arrays;
import java.util.Scanner;

public class LCSforThreeStrings {
    public static int helper(String s1, String s2, String s3, int n, int m, int p, int[][][] dp) {
        if (n == 0 || m == 0 || p == 0) {
            return 0;
        }
        if (dp[n][m][p] != -1) {
            return dp[n][m][p];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1) && s1.charAt(n - 1) == s3.charAt(m - 1)) {

            return 1 + helper(s1, s2, s3, n - 1, m - 1, p - 1, dp);
        }
        int i1 = helper(s1, s2, s3, n - 1, m, p, dp);
        int i2 = helper(s1, s2, s3, n, m - 1, p, dp);
        int i3 = helper(s1, s2, s3, n, m, p - 1, dp);
        int i4 = helper(s1, s2, s3, n, m - 1, p - 1, dp);
        int i5 = helper(s1, s2, s3, n - 1, m, p - 1, dp);
        int i6 = helper(s1, s2, s3, n - 1, m - 1, p, dp);


        return dp[n][m][p] = Math.max(i6, Math.max(i5, Math.max(i4, Math.max(i3, Math.max(i1, i2)))));


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        String text1 = sc.nextLine();//abcde
//        String text2 = sc.nextLine();//ace
//        String text3 = sc.nextLine();
        String text1 = "GHQWNV";
        String text2 = "SJNSDGH";
        String text3 = "CPGMAH";
        int[][][] dp = new int[text1.length() + 1][text2.length() + 1][text3.length() + 1];
        for (int[][] row : dp) {
            for (int[] col : row) {
                Arrays.fill(col, -1);
            }

        }
        for (int[][] row : dp) {
            for (int[] col : row) {
                for (int a : col) {
                    System.out.println(a);
                }
            }

        }

//        System.out.println(helper(text1, text2,text3 , text1.length(), text2.length(),text3.length(), dp));
    }
}
