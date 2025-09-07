package randompractice;

import java.util.*;

public class minoptions {
    private static int bfs(int r, int c, int R, int C, char[][] mat) {
        Queue<int[]> queue = new LinkedList<>();
        boolean visited[][] = new boolean[R][C];
        visited[r][c] = true;
        queue.add(new int[] { r, c });
        int count = 0;
        int diff[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] currpos = queue.poll();
                int curow = currpos[0];
                int curcol = currpos[1];
                if (mat[curow][curcol] == 'C') {
                    return count;
                }
                visited[curow][curcol] = true;
                for (int ind = 0; ind < 4; ind++) {
                    int adjr = diff[ind][0] + curow;
                    int adjc = diff[ind][1] + curcol;
                    if (adjr >= 0 && adjr < R && adjc >= 0 && adjc < C && mat[adjr][adjc] != '1'
                            && !visited[adjr][adjc]) {
                        queue.add(new int[] { adjr, adjc });
                    }
                }
            }
            count++;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        char mat[][] = new char[R][C];
        int srow = 0;
        int scol = 0;
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                mat[r][c] = sc.next().charAt(0);
                if (mat[r][c] == 'R') {
                    srow = r;
                    scol = c;
                }
            }
        }
        boolean flag = false;

        System.out.println(bfs(srow, scol, R, C, mat));
    }
}
