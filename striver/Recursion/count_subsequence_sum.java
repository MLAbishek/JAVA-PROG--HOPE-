package Recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class count_subsequence_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int k = sc.nextInt();
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(helper(0, ans, 0, N, k, arr));
    }

    private static int helper(int index, ArrayList<Integer> ans, int total, int N, int k, int[] arr) {
        if (index == N) {
            if (total == k) {
                return 1;
            }
            return 0;
        }
        int val = arr[index];

        ans.add(val);
        int lc = helper(index + 1, ans, total + val, N, k, arr);
        ans.remove(ans.size() - 1);
        int rc = helper(index + 1, ans, total, N, k, arr);
        return lc + rc;
    }
}
