package Recursion;

import java.util.*;

public class Sum_of_all_subsets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        List<Integer> sum = new ArrayList<>();
        helper(0, arr, 0, N);
    }

    private static void helper(int ind, int[] arr, int total, int N) {
        if (ind == N) {
            System.out.print(total + " ");
            return;
        }
        helper(ind + 1, arr, total + arr[ind], N);
        helper(ind + 1, arr, total, N);
    }
}
