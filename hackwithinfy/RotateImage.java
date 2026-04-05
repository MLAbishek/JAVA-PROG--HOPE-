package hackwithinfy;

import java.util.Scanner;

public class RotateImage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int mat[][] = new int[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                mat[r][c] = sc.nextInt();
            }
        }

        int trans[][] = new int[C][R];

        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                trans[c][r] = mat[r][c];
            }
        }

        int tr = C;
        int tc = R - 1;
        for (int r = 0; r < tr; r++) {
            for (int c = tc; c >= 0; c--) {

                System.out.print(trans[r][c] + " ");
            }
            System.out.println();
        }
    }
}
