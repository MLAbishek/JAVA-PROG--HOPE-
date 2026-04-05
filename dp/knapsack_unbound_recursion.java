import java.util.Scanner;

public class knapsack_unbound_recursion {
    private static int ksacub(int ind, int[] val, int[] weight, int N, int W) {
        if (ind == N || W == 0) {
            return 0;
        }
        int take = 0;
        if (weight[ind] <= W) {
            take = val[ind] + ksacub(ind, val, weight, N, W - weight[ind]);
        }
        int notake = ksacub(ind + 1, val, weight, N, W);
        return Math.max(take, notake);

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
        int ans = ksacub(0, val, weight, N, W);
        System.out.print(ans);

    }
}
