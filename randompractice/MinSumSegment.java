import java.util.*;

public class MinSumSegment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int lo = 0;
        while ((1 << lo) < n) {
            lo++;
        }
        int start = (int) (Math.pow(2, lo));
        int len = start * 2;
        int mat[] = new int[len];
        for (int i = start; i < start + n; i++) {
            mat[i] = sc.nextInt();
        }
        for (int i = start - 1; i >= 1; i--) {
            mat[i] = mat[2 * i] + mat[(2 * i) + 1];
        }

        while (t-- > 0) {
            int ql = sc.nextInt() - 1;
            int qr = sc.nextInt() - 1;
            System.out.println(find(mat, 1, 0, start - 1, ql, qr));
        }
    }

    private static int find(int[] mat, int node, int nl, int nr, int ql, int qr) {
        if (nl > qr || ql > nr) {
            return 0;
        }
        if (ql >= nl && nr <= qr) {
            return mat[node];
        }
        int mid = (nl + nr) / 2;
        int left = find(mat, node * 2, nl, mid, ql, qr);
        int right = find(mat, (node * 2) + 1, mid + 1, nr, ql, qr);
        return left + right;
    }

}
