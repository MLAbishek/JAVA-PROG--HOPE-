//package atCoder;

import java.util.*;

public class search_and_delete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M, N;
        M = sc.nextInt();
        N = sc.nextInt();
        int[] parent = new int[M];
        int[] child = new int[N];
        for (int i = 0; i < M; i++) {
            parent[i] = sc.nextInt();
        }
        for (int j = 0; j < N; j++) {
            child[j] = sc.nextInt();
        }
        Arrays.sort(child);
        int i = 0, j = 0;
        while (i < M && j < N) {
            if (parent[i] == child[j]) {
                parent[i] = 0;
                i++;
                j++;
            } else if (parent[i] < child[j]) {
                i++;
            } else {
                j++;
            }
        }
        for (int ind = 0; ind < M; ind++) {
            if (parent[ind] != 0) {
                System.out.print(parent[ind] + " ");
            }
        }
        sc.close();
    }
}
