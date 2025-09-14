package codeforces;

import java.util.*;

public class MaxEvenSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans = -1;
            for (long i = 1; i <= b; i++) {
                long tempa = a;
                long tempb = b;
                if (b % i == 0) {
                    tempb = tempb / i;
                    tempa = tempa * i;
                    if ((tempa + tempb) % 2 == 0) {
                        ans = Math.max(ans, tempa + tempb);

                    }
                }
            }
            System.out.println(ans);
        }
    }
}
