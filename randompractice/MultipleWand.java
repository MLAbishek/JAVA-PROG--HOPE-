package randompractice;

import java.util.*;

public class MultipleWand {
    private static boolean dfs(int r, int c, int R, int C, char[][] mat, boolean[][] visited) {
        if (mat[r][c] == 'W') {
            return true;
        }
        int diff[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        visited[r][c] = true;
        for (int i = 0; i < 4; i++) {
            int adjr = r + diff[i][0];
            int adjc = c + diff[i][1];
            if (adjr >= 0 && adjr < R && adjc >= 0 && adjc < C && !visited[adjr][adjc] && mat[r][c] != '1') {
                boolean flag = dfs(adjr, adjc, R, C, mat, visited);
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
        boolean flag = true;
        char[][] mat = new char[R][C];
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                mat[r][c] = sc.next().charAt(0);

                if (mat[r][c] == 'B') {
                    boolean[][] visited = new boolean[R][C];
                    if (dfs(r, c, R, C, mat, visited))
                        continue;
                    else {
                        flag = false;
                        break;
                    }
                }
            }
            if (!flag) {
                break;
            }
        }
        if (flag)
            System.out.println("yes");
        else
            System.out.println("NO");

    }
}
