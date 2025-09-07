package codeforces;

import java.util.*;

public class lever {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int N = sc.nextInt();
            int a[] = new int[N];
            int b[] = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = sc.nextInt();

            }
            for (int j = 0; j < N; j++) {
                b[j] = sc.nextInt();
            }
            int count = 0;

            for (int i = 0; i < N; i++) {
                if (a[i] > b[i]) {
                    count += a[i] - b[i];
                }
            }

            System.out.println(count + 1);

        }
        sc.close();
    }
}
