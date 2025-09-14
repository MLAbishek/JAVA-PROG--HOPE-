package codeforces;

import java.util.*;

public class SublimeSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (y % 2 == 0)
                System.out.println(0);
            else
                System.out.println(x);
        }
    }
}