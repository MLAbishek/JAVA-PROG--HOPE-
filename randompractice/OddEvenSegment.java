
import java.util.*;

public class OddEvenSegment {
    static long[] odd, even;
    static int n, start, lim;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int lg = 0;
        while ((1 << lg) < n)
            lg++;
        lim = (1 << lg);
        start = lim;
        lim *= 2;

        odd = new long[lim];
        even = new long[lim];

        for (int i = 0; i < n; i++) {
            int pos = start + i;
            int val = sc.nextInt();
            if ((i + 1) % 2 == 1)
                odd[pos] = val;
            else
                even[pos] = val;
        }

        for (int i = start - 1; i >= 1; i--) {
            odd[i] = odd[2 * i] + odd[2 * i + 1];
            even[i] = even[2 * i] + even[2 * i + 1];
        }

        int l = sc.nextInt() - 1;
        int r = sc.nextInt() - 1;

        long oddsum = find(odd, 1, 0, start - 1, l, r);
        long evensum = find(even, 1, 0, start - 1, l, r);

        System.out.println("Odd Sum: " + oddsum + "  Even Sum: " + evensum);
    }

    private static long find(long[] tree, int node, int nl, int nr, int ql, int qr) {
        if (qr < nl || nr < ql)
            return 0;
        if (ql <= nl && nr <= qr)
            return tree[node];
        int mid = (nl + nr) / 2;
        return find(tree, 2 * node, nl, mid, ql, qr) +
                find(tree, 2 * node + 1, mid + 1, nr, ql, qr);
    }
}
