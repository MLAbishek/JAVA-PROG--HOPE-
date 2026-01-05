
package randompractice;

import java.util.*;

public class SpraseTraining {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int lg = 0;
        while ((1 << lg) < n) {
            lg++;
        }
        int[][] mat = new int[lg][n];
        mat[0] = Arrays.copyOf(arr, n);
        for (int r = 1; r < lg; r++) {
            for (int c = 0; c + (1 << r) <= n; c++) {
                mat[r][c] = Math.min(mat[r - 1][c], mat[r - 1][c + (1 << (r - 1))]);
            }
        }
        for (int r = 0; r < lg; r++) {
            for (int c = 0; c + (1 << r) <= n; c++) {
                System.out.print(mat[r][c] + " ");
            }
            System.out.println();
        }

        int s = sc.nextInt() - 1;
        int e = sc.nextInt() - 1;
        int lo = 0;
        while ((1 << lo) <= n) {
            lo++;
        }
        int dif = e - s + 1;
        int ans = Math.min(mat[lo][s], mat[lo][e - (1 << dif) + 1]);
        System.out.println(ans);

    }
}
