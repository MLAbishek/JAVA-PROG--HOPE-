package codeforces;

import java.util.*;

public class FunPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            // Arrays.sort(arr);
            for (int i = 1; i <= N; i++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
