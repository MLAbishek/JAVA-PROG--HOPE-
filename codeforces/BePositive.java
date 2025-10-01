package codeforces;

import java.util.*;

public class BePositive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int zero = 0;
            int negative = 0;
            int N = sc.nextInt();
            int arr[] = new int[N];
            for (int i = 0; i < N; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] == 0) {
                    zero++;
                }
                if (arr[i] == -1) {
                    negative++;

                }
            }
            int steps = 0;
            steps += zero;
            if (negative % 2 != 0) {

                steps += 2;
            }
            System.out.println(steps);

        }

    }
}
