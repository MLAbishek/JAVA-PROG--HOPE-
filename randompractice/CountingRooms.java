package randompractice;

import java.util.*;

public class CountingRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        sc.nextLine();
        char mat[][] = new char[R][C];
        for (int r = 0; r < R; r++) {
            String s = sc.nextLine();
            for (int c = 0; c < C; c++) {
                mat[r][c] = s.charAt(c);
            }
        }
        int count = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (mat[r][c] == '.') {
                    bfs(r, c, R, C, mat);
                    count++;
                }
            }
        }
        System.out.println(count);

    }

    private static void bfs(int r, int c, int R, int C, char[][] mat) {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[] { r, c });
        while (!q.isEmpty()) {
            int[] cor = q.poll();
            int row = cor[0];
            int col = cor[1];
            // mat[row][col] = '#';
            int diff[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
            for (int i = 0; i < 4; i++) {
                int adjr = row + diff[i][0];
                int adjc = col + diff[i][1];
                if (adjr >= 0 && adjr < R && adjc >= 0 && adjc < C && mat[adjr][adjc] == '.') {
                    q.add(new int[] { adjr, adjc });
                    mat[adjr][adjc] = '#';
                }

            }
        }
        return;

    }
}
