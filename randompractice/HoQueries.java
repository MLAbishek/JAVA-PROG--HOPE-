package randompractice;

import java.io.*;
import java.util.*;

public class HoQueries {
    private static int find(int[] dp, int node, int start, int end, int rooms) {
        if (rooms > dp[node])
            return 0;
        if (start == end) {
            dp[node] -= rooms;
            return start + 1;
        }
        int mid = (start + end) / 2;
        int left = find(dp, node * 2, start, mid, rooms);
        if (left != 0) {
            dp[node] = Math.max(dp[node * 2], dp[node * 2 + 1]);
            return left;
        }
        int right = find(dp, node * 2 + 1, mid + 1, end, rooms);
        if (right != 0) {
            dp[node] = Math.max(dp[node * 2], dp[node * 2 + 1]);
            return right;
        }
        return 0;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int log = 0;
        while ((1 << log) < n)
            log++;
        int size = 1 << log;
        int[] dp = new int[size * 2];

        Arrays.fill(dp, Integer.MIN_VALUE);
        for (int i = 0; i < n; i++)
            dp[size + i] = Integer.parseInt(st.nextToken());

        for (int i = size - 1; i > 0; i--)
            dp[i] = Math.max(dp[2 * i], dp[2 * i + 1]);

        StringBuilder sb = new StringBuilder();
        st = new StringTokenizer(br.readLine());
        while (q-- > 0) {

            int l = Integer.parseInt(st.nextToken());
            sb.append(find(dp, 1, 0, size - 1, l)).append(" ");
        }

        System.out.print(sb);
    }
}