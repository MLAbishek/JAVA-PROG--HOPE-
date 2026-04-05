import java.util.Arrays;
import java.util.Scanner;

public class knapsack_tabulation {
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
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= W; j++) {
                if (weight[i - 1] <= j) {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i - 1]] + val[i - 1]);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        for (int r = 0; r < dp.length; r++) {
            for (int c = 0; c < dp[0].length; c++) {
                System.out.print(dp[r][c] + " ");
            }
            System.err.println();
        }
        System.out.print(dp[N][W]);
    }
}
