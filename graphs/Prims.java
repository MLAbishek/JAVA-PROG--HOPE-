package graphs;

import java.util.*;

public class Prims {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int e = sc.nextInt();
        int[][] mat = new int[v][v];
        for (int i = 0; i < e; i++) {
            int sv = sc.nextInt();
            int ev = sc.nextInt();
            int w = sc.nextInt();
            mat[sv][ev] = w;
            mat[ev][sv] = w;

        }
        boolean visited[] = new boolean[v];
        visited[0] = true;
        for (int ind = 0; ind < v - 1; ind++) {
            int x = 0;
            int y = 0;
            int min = Integer.MAX_VALUE;
            for (int sv = 0; sv < v; sv++) {
                if (visited[sv]) {
                    for (int ev = 0; ev < v; ev++) {
                        if (mat[sv][ev] != 0 && !visited[ev]) {
                            if (mat[sv][ev] < min) {
                                min = mat[sv][ev];
                                x = sv;
                                y = ev;
                            }
                        }
                    }
                }
            }
            if (min != Integer.MAX_VALUE) {
                System.out.println(x + " " + y + " " + min);
                visited[y] = true;
            }
        }
    }
}
