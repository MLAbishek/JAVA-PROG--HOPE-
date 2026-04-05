import java.util.*;

public class knapsack_unbound_memoisation {
    private static int ksacub(int ind, int[] val, int[] weight, int N, int W, int[][] dp) {
        if (ind == N || W == 0) {
            return 0;
        }
        if (dp[ind][W] != -1) {
            return dp[ind][W];
        }
        int take = 0;
        if (weight[ind] <= W) {
            take = val[ind] + ksacub(ind, val, weight, N, W - weight[ind], dp);
        }
        int notake = ksacub(ind + 1, val, weight, N, W, dp);
        dp[ind][W] = Math.max(take, notake);
        return dp[ind][W];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int val[] = new int[N];
        int weight[] = new int[N];

        for (int i = 0; i < N; i++) {
            int v = sc.nextInt();
            int w = sc.nextInt();
            val[i] = v;
            weight[i] = w;
        }

        int W = sc.nextInt();
        int dp[][] = new int[N + 1][W + 1];
        for (int i = 0; i <= N; i++) {
            Arrays.fill(dp[i], -1);
        }
        int ans = ksacub(0, val, weight, N, W, dp);
        System.out.print(ans);

    }
}
