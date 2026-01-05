
import java.io.*;
import java.util.*;

public class DynamicRangeSumQueries {
    public static void update(long[] dp, int pos, long val, int sizehalf) {
        pos = pos + sizehalf - 1;
        dp[pos] = val;
        while (pos > 1) {
            pos = pos / 2;
            dp[pos] = dp[pos * 2] + dp[(pos * 2) + 1];
        }
    }

    public static long find(long[] dp, int index, int rl, int rr, int s, int e) {
        if (s > rr || e < rl)
            return 0;

        if (s <= rl && e >= rr)
            return dp[index];

        int mid = (rl + rr) / 2;
        long left = find(dp, 2 * index, rl, mid, s, e);
        long right = find(dp, 2 * index + 1, mid + 1, rr, s, e);
        return left + right;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int query = Integer.parseInt(st.nextToken());
        int log = (int) Math.ceil(Math.log(n) / Math.log(2));
        int sizehalf = (int) Math.pow(2, log);
        int size = sizehalf * 2;
        long[] dp = new long[size];

        st = new StringTokenizer(br.readLine());
        for (int i = sizehalf; i < sizehalf + n; i++) {
            dp[i] = Long.parseLong(st.nextToken());
        }

        for (int i = sizehalf - 1; i >= 1; i--) {
            dp[i] = dp[2 * i] + dp[2 * i + 1];
        }
        for (int q = 0; q < query; q++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                int pos = Integer.parseInt(st.nextToken());
                int val = Integer.parseInt(st.nextToken());
                update(dp, pos, val, sizehalf);
            } else {
                int start = Integer.parseInt(st.nextToken());
                int end = Integer.parseInt(st.nextToken());
                long result = find(dp, 1, 1, sizehalf, start, end);
                out.append(result).append('\n');
            }
        }

        System.out.print(out);
    }
}