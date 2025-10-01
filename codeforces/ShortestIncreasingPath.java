package codeforces;

import java.util.*;

public class ShortestIncreasingPath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (x > y && y % 2 == 0 && x % 2 == 0) {
                System.out.println(3);
            } else if (x < y && y % 2 == 0) {
                System.out.println(2);
            } else {
                System.out.println(-1);
            }

        }

    }
}
