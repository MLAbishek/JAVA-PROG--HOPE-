package codeforces;

import java.util.*;

public class Lasers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int xh[] = new int[n];
            int yh[] = new int[m];
            for (int i = 0; i < n; i++)
                xh[i] = sc.nextInt();
            for (int i = 0; i < m; i++)
                yh[i] = sc.nextInt();
            System.out.println(n + m);
        }
    }
}
