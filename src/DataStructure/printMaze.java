package DataStructure;


import java.util.Scanner;

public class printMaze {
    static int count = 0;

    public static void helper(int cr, int cc, int n, int m, String path) {
        if (cr == n && cc == m) {
            System.out.print(path + " ");
            count++;
            return;
        }
        if (cr > n || cc > m) {
            return;
        }
        if (cr == cc || cr + cc == n + m) {
            helper(cr + 1, cc + 1, n, m, path + "D");
        }
        helper(cr + 1, cc, n, m, path + "V");
        helper(cr, cc + 1, n, m, path + "H");
    }

    public static void main(String args[]) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        count = 0;
        helper(0, 0, n - 1, m - 1, "");
        System.out.println();
        System.out.println(count);
    }
}

//public class printMaze {
//
//}
