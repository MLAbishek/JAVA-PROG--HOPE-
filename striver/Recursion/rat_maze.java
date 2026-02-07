package Recursion;

import java.util.*;

public class rat_maze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int[][] board = new int[N][N];
        for (int r = 0; r < N; r++) {
            for (int c = 0; c < N; c++) {
                board[r][c] = sc.nextInt();
            }
        }
        boolean visited[][] = new boolean[N][N];
        helper(0, 0, ans, sb, board, visited, N);
        for (String s : ans) {
            System.out.print(s + " ");
        }

    }

    private static void helper(int r, int c, List<String> ans, StringBuilder sb, int[][] board, boolean[][] visited,
            int N) {
        if (r == N - 1 && c == N - 1) {
            ans.add(sb.toString());
            return;
        }
        visited[r][c] = true;
        int diff[][] = { { 0, -1 }, { 1, 0 }, { 0, 1 }, { -1, 0 } };
        for (int i = 0; i < 4; i++) {
            int adjr = r + diff[i][0];
            int adjc = c + diff[i][1];
            if (adjr >= 0 && adjr < N && adjc >= 0 && adjc < N && board[adjr][adjc] == 1 && !visited[adjr][adjc]) {
                if (i == 0) {
                    sb.append("L");
                } else if (i == 1) {
                    sb.append("D");
                } else if (i == 2) {
                    sb.append("R");
                } else {
                    sb.append("U");
                }
                helper(adjr, adjc, ans, sb, board, visited, N);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
        visited[r][c] = false;

    }

}
