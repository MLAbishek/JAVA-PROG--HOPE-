import java.io.*;
import java.util.*;

public class RangeUpdateQueries {

    public static long find(long[] dp, int pos, int sizehalf) {
        long sum = dp[sizehalf + pos - 1];
        pos += sizehalf - 1;
        while (pos > 1) {
            pos /= 2;
            sum += dp[pos];
        }
        return sum;
    }

    static void update(long[] dp, int index, int rl, int rr, int s, int e, int incre) {
        if (s > rr || e < rl)
            return;
        if (s <= rl && rr <= e) {
            dp[index] = dp[index] + incre;
            return;
        }
        int mid = (rl + rr) / 2;
        update(dp, 2 * index, rl, mid, s, e, incre);
        update(dp, 2 * index + 1, mid + 1, rr, s, e, incre);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        int log = (int) Math.ceil(Math.log(n) / Math.log(2));
        int sizehalf = 1 << log;
        int size = sizehalf * 2;
        long[] dp = new long[size];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            dp[sizehalf + i] = Long.parseLong(st.nextToken());
        }

        for (int i = 0; i < q; i++) {
            st = new StringTokenizer(br.readLine());
            int type = Integer.parseInt(st.nextToken());
            if (type == 1) {
                int k = Integer.parseInt(st.nextToken());
                int u = Integer.parseInt(st.nextToken());
                int incre = Integer.parseInt(st.nextToken());
                update(dp, 1, 1, sizehalf, k, u, incre);
            } else {
                int b = Integer.parseInt(st.nextToken());
                long res = find(dp, b, sizehalf);
                out.append(res).append('\n');
            }
        }

        System.out.print(out);
    }
}