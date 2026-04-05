package codeforces;

import java.util.*;

public class EatingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int n = sc.nextInt();
            int max = 0;
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(max, arr[i]);
            }
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] == max) {
                    count++;
                }
            }
            System.out.println(count);

        }

    }
}
