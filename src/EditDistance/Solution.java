package EditDistance;

import java.util.Arrays;

public class Solution {
    public static int helper(String s1, String s2, int n, int m, int[][] dp) {
        // insert delete replace
        if (n == 0 && m == 0) {
            return 0;
        }
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (s1.charAt(n - 1) == s2.charAt(m - 1)) {

            return helper(s1, s2, n - 1, m - 1, dp);
        }
        int insert = helper(s1, s2, n, m - 1, dp);
        int delete = helper(s1, s2, n - 1, m, dp);
        int replace = helper(s1, s2, n - 1, m - 1, dp);
        return dp[n][m] = 1 + Math.min(insert, (Math.min(delete, replace)));
    }

    public static void main(String[] args) {
        String text1 = "intention";
        String text2 = "execution";
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(helper(text1, text2, text1.length(), text2.length(), dp));
    }
}
