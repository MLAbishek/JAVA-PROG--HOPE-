package randompractice;

import java.util.*;

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int lo = 0;
        while ((1 << lo) < n) {
            lo++;
        }
        int size = (1 << lo);
        int lim = size * 2;
        long[] odd = new long[lim];
        long[] even = new long[lim];
        for (int i = 0; i < n; i++) {
            if ((i + 1) % 2 == 1) {
                odd[i + size] = sc.nextLong();
            } else {
                even[i + size] = sc.nextLong();
            }
        }

        for (int i = size - 1; i >= 1; i--) {
            odd[i] = odd[2 * i] + odd[2 * i + 1];
            even[i] = even[2 * i] + even[2 * i + 1];
        }

        int s = sc.nextInt() - 1;
        int e = sc.nextInt() - 1;
        long od = find(odd, 0, size - 1, 1, s, e, size);
        long ev = find(even, 0, size - 1, 1, s, e, size);
        System.out.println(od);
        System.out.println(ev);

    }

    private static long find(long[] dp, int rl, int rr, int index, int ql, int qr, int size) {
        if (rr < ql || qr < rl) {
            return 0;
        }
        if (ql <= rl && rr <= qr) {
            return dp[index];
        }
        int mid = (rl + rr) / 2;
        long left = find(dp, rl, mid, index * 2, ql, qr, size);
        long right = find(dp, mid + 1, rr, index * 2 + 1, ql, qr, size);
        return left + right;
    }
}
