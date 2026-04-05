import java.util.Scanner;

public class knapsack_unbound_tabulation {
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
        int dp[][] = new int[N+1][W+1];
        
    }
}
