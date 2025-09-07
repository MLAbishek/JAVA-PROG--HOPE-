package juspay;

import java.util.PriorityQueue;
import java.util.Scanner;

public class juspay0054 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T, N;
        T = sc.nextInt();
        N = sc.nextInt();
        int[] mpow = new int[N];
        int[] rest = new int[N];
        int days = 1;
        int produced = 0;
        PriorityQueue<int[]> minheap = new PriorityQueue<>((a, b) -> {
            return a[0] - b[0];
        });
        for (int i = 0; i < N; i++) {
            mpow[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            rest[i] = sc.nextInt();
            minheap.add(new int[] { rest[i] + 1, i });
            produced += mpow[i];
        }
        if (produced >= T) {
            System.out.println(days);
        } else {

            while (produced < T) {
                int nxt[] = minheap.poll();
                int curday = nxt[0];
                int midx = nxt[1];
                produced += mpow[midx];
                days = curday;
                minheap.add(new int[] { curday + rest[midx], midx });
            }
            System.out.println(days);
        }
        sc.close();

    }
}
