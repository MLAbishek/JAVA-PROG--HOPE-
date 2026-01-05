import java.io.*;

public class sparx {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String[] first = br.readLine().split(" ");
        int n = Integer.parseInt(first[0]);
        int q = Integer.parseInt(first[1]);

        int[] log = new int[n + 1];
        for (int i = 2; i <= n; i++)
            log[i] = log[i / 2] + 1;
        int K = log[n] + 1;

        int[][] dp = new int[n][K];
        String[] arr = br.readLine().split(" ");
        for (int i = 0; i < n; i++)
            dp[i][0] = Integer.parseInt(arr[i]);

        for (int j = 1; j < K; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i + (1 << (j - 1))][j - 1]);
            }
        }

        for (int i = 0; i < q; i++) {
            String[] range = br.readLine().split(" ");
            int l = Integer.parseInt(range[0]) - 1;
            int r = Integer.parseInt(range[1]) - 1;
            int len = r - l + 1;
            int j = log[len];
            int ans = Math.min(dp[l][j], dp[r - (1 << j) + 1][j]);
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}