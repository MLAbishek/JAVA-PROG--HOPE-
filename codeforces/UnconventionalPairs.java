package codeforces;

import java.util.*;

public class UnconventionalPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
            }
            int threshold = Integer.MIN_VALUE;

            Arrays.sort(arr);
            for (int i = 0; i < N - 1; i += 2) {
                threshold = Math.max(threshold, Math.abs(arr[i] - arr[i + 1]));
            }
            System.out.println(threshold);
        }
    }
}
