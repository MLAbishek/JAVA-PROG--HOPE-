package randompractice;

import java.util.Scanner;

public class MagicWand {
    private static boolean dfs(int r, int c, int R, int C, int p, char[][] mat, boolean[][] visited) {
        if (mat[r][c] == 'W') {
            return true;
        }

        int diff[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        int val = mat[r][c] - '0';
        p = Character.isAlphabetic(mat[r][c]) ? p : p - val;
        if (p < 0) {
            return false;
        }
        visited[r][c] = true;
        for (int ind = 0; ind < 4; ind++) {
            int adjr = r + diff[ind][0];
            int adjc = c + diff[ind][1];
            if (adjr >= 0 && adjr < R && adjc >= 0 && adjc < C && !visited[adjr][adjc]) {
                boolean flag = dfs(adjr, adjc, R, C, p, mat, visited);
                if (flag)
                    return true;
            }
        }
        visited[r][c] = false;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        int srow = 0;
        int scol = 0;
        char[][] board = new char[R][C];
        boolean[][] visited = new boolean[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                board[r][c] = sc.next().charAt(0);
                if (board[r][c] == 'B') {
                    srow = r;
                    scol = c;
                }
            }
        }
        int point = sc.nextInt();
        if (dfs(srow, scol, R, C, point, board, visited))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}
