package graphs;

import java.util.*;

public class Dijkshtra {
    private static int minval(int dis[], boolean visited[], int v) {
        int min = Integer.MAX_VALUE;
        int minind = -1;
        for (int i = 0; i < v; i++) {
            if (dis[i] < min && !visited[i]) {
                min = dis[i];
                minind = i;
            }
        }
        return minind;
    }

    private static void dijk(int v, int e, int[][] mat) {
        boolean[] visited = new boolean[v];
        int[] dis = new int[v];

        for (int i = 0; i < v; i++) {
            dis[i] = Integer.MAX_VALUE;
        }
        dis[0] = 0;
        for (int sv = 0; sv < v - 1; sv++) {
            int minv = minval(dis, visited, v);
            for (int ev = 0; ev < v; ev++) {
                if (mat[sv][ev] != 0 && !visited[ev] && dis[ev] > dis[sv] + mat[sv][ev]) {
                    dis[ev] = dis[sv] + mat[sv][ev];
                }
            }
            visited[sv] = true;
        }
        for (int i = 0; i < v; i++) {
            System.out.println(i + " " + dis[i]);
        }

    }

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
        dijk(v, e, mat);

    }
}