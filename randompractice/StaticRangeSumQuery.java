package randompractice;

import java.util.Scanner;

public class StaticRangeSumQuery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        long arr[] = new long[n + 1];
        for (int i = 1; i <= n; i++) {
            long val = sc.nextLong();
            arr[i] = arr[i - 1] + val;
        }
        while (t-- > 0) {
            int s = sc.nextInt();
            int e = sc.nextInt();
            System.out.println(arr[e] - arr[s - 1]);
        }
    }
}
