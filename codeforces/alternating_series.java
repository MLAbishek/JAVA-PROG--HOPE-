package codeforces;

import java.util.Scanner;

public class alternating_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            int val;
            if (N > 3) {
                if (N % 2 == 0) {
                    val = N / 2;
                } else {
                    val = (N / 2) + 1;
                }
            } else {
                val = N;
            }
            for (int i = 0; i < N; i++) {
                if (i % 2 == 0) {
                    arr[i] = -1;

                } else {
                    arr[i] = val;
                    val--;
                }

            }
            for (int i = 0; i < N; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
