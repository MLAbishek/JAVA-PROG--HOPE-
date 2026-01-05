
import java.util.*;

public class MinRangeSubquery {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int lg = 0;
        while ((1 << lg) < n) {
            lg++;
        }
        int lim = (int) (Math.pow(2, lg));
        int start = lim;

        lim = lim * 2;

        int mat[] = new int[lim];

        Arrays.fill(mat, Integer.MAX_VALUE);
        for (int i = start; i < start + n; i++) {
            mat[i] = sc.nextInt();
        }
        int ind = start - 1;
        for (int i = ind; i >= 1; i--) {
            mat[i] = Math.min(mat[2 * i], mat[(2 * i) + 1]);

        }
        while (t-- > 0) {
            int ql = sc.nextInt() - 1;
            int qr = sc.nextInt() - 1;
            System.out.println(find(mat, 1, 0, start - 1, ql, qr, start));
        }

    }

    private static int find(int[] mat, int node, int nl, int nr, int ql, int qr, int N) {
        if (qr < nl || nr < ql) {
            return Integer.MAX_VALUE;
        }
        if (nl >= ql && nr <= qr) {
            return mat[node];
        }
        int mid = (nl + nr) / 2;
        int left = find(mat, node * 2, nl, mid, ql, qr, N);
        int right = find(mat, (node * 2) + 1, mid + 1, nr, ql, qr, N);
        return Math.min(left, right);
    }
}
