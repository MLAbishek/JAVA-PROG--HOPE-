import java.util.*;

public class knapsack_memo {

    private static int ksac(int[] weight, int[] val, int W, int n, int[][] dp) {
        if (n == 0 || W == 0) {
            return 0;
        }
        if (dp[n - 1][W] != -1) {
            return dp[n - 1][W];
        }
        if (weight[n - 1] <= W) {
            dp[n - 1][W] = Math.max(val[n - 1] + ksac(weight, val, W - weight[n - 1], n - 1, dp),
                    ksac(weight, val, W, n - 1, dp));
            return dp[n - 1][W];
        }
        dp[n - 1][W] = ksac(weight, val, W, n - 1, dp);
        return dp[n - 1][W];

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
        int[][] dp = new int[N + 1][W + 1];
        for (int i = 0; i < N; i++) {
            Arrays.fill(dp[i], -1);
        }

        int max = ksac(weight, val, W, weight.length, dp);
        System.out.println(max);
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

    }
}