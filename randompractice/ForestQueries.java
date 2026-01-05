import java.io.*;
import java.util.*;

public class ForestQueries {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int q = Integer.parseInt(st.nextToken());

        char[][] grid = new char[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            String s = br.readLine();
            for (int j = 1; j <= n; j++) {
                grid[i][j] = s.charAt(j - 1);
            }
        }

        int[][] pre = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                pre[i][j] = (grid[i][j] == '*' ? 1 : 0)
                        + pre[i - 1][j]
                        + pre[i][j - 1]
                        - pre[i - 1][j - 1];
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < q; k++) {
            st = new StringTokenizer(br.readLine());
            int y1 = Integer.parseInt(st.nextToken());
            int x1 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());

            int ans = pre[y2][x2]
                    - pre[y1 - 1][x2]
                    - pre[y2][x1 - 1]
                    + pre[y1 - 1][x1 - 1];
            sb.append(ans).append('\n');
        }

        System.out.print(sb.toString());
    }
}
