package Recursion;

import java.util.*;

public class subsequence_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(0, ans, 0, N, k, arr);
    }

    private static void helper(int index, ArrayList<Integer> ans, int total, int N, int k, int[] arr) {
        if (index == N) {
            if (total == k) {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
            return;
        }
        int val = arr[index];

        ans.add(val);
        helper(index + 1, ans, total + val, N, k, arr);
        ans.remove(ans.size() - 1);
        helper(index + 1, ans, total, N, k, arr);
    }

}
