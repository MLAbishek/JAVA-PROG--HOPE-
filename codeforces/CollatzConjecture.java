package codeforces;

import java.util.*;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int k = sc.nextInt();
            int x = sc.nextInt();
            for (int i = 0; i < k; i++) {

                x = x * 2;

            }
            System.out.println(x);
        }
    }
}