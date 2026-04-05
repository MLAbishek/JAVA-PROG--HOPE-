package codeforces;

import java.util.*;

public class lol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            System.out.print("1 ");
            for (int i = 2; i <= n; i++) {
                System.out.print((long) i * (i - 1) + " ");
            }
            System.out.println();
        }
    }
}