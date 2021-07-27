package MaxDotProductOfTwoSubsequence;

public class MaxProduct {
    public static int solution(int[] a1, int[] a2, int n, int m) { // here n and m are length of array a1 and a2
        if (n == 0 && m == 0) {
            return a1[0] * a2[0];
        }


        if (n >= 0 && m >= 0) {
            return solution(a1, a2, n - 1, m - 1);
        }
        int in = solution(a1, a2, n - 1, m);
        int ex = solution(a1, a2, n, m - 1);
        return Math.max(in, ex);
    }

    public static void main(String[] args) {
        int[] nums1 = {2, 1, -2, 5};
        int[] nums2 = {3, 0, -6};
        int a = solution(nums1, nums2, nums1.length, nums2.length);
        System.out.println(a);
    }
}
