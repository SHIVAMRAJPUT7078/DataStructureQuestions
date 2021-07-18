package UncrossedLines;

import java.util.Arrays;

public class uncrossLines {
    public static int helper(int[] a1, int[] a2, int n, int m, int[][] dp) {
//        return 0;
        if (n == 0 || m == 0) {
            return 0;
        }
        if (dp[n][m] != -1) {
            return dp[n][m];
        }
        if (a1[n - 1] == a2[m - 1]) {

            return 1 + helper(a1, a2, n - 1, m - 1, dp);
        }
        int in = helper(a1, a2, n - 1, m, dp);
        int ex = helper(a1, a2, n, m - 1, dp);

        return (Math.max(in, ex));


    }

    public static void main(String[] args) {
        int[] nums1 = {2, 5, 1, 2, 5};
        int[] nums2 = {10, 5, 2, 1, 5, 2};
        int[][] dp = new int[nums1.length + 1][nums2.length + 1];
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }
        System.out.println(helper(nums1, nums2, nums1.length, nums2.length, dp));
    }
}
