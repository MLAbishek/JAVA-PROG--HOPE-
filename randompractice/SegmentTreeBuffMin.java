
import java.io.*;
import java.util.*;

public class SegmentTreeBuffMin {

    public static long find(long[] dp, int index, int rl, int rr, int s, int e) {
        if (s > rr || e < rl)
            return Long.MAX_VALUE;

        if (s <= rl && e >= rr)
            return dp[index];

        int mid = (rl + rr) / 2;
        long left = find(dp, 2 * index, rl, mid, s, e);
        long right = find(dp, 2 * index + 1, mid + 1, rr, s, e);
        return Math.min(left, right);
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
        Arrays.fill(dp, Long.MAX_VALUE);
        st = new StringTokenizer(br.readLine());
        for (int i = sizehalf; i < sizehalf + n; i++) {
            dp[i] = Long.parseLong(st.nextToken());
        }

        for (int i = sizehalf - 1; i >= 1; i--) {
            dp[i] = Math.min(dp[2 * i], dp[2 * i + 1]);
        }
        for (int q = 0; q < query; q++) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            long result = find(dp, 1, 1, sizehalf, start, end);
            out.append(result).append('\n');
        }

        System.out.print(out);
    }
}