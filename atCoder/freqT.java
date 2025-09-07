//package atCoder;

import java.util.*;

public class freqT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = s.length();
        double totans = 0;
        for (int i = 0; i < N - 1; i++) {
            if (s.charAt(i) == 't') {

                int tcount = 1;
                int maxlen = 0;
                for (int j = i + 1; j < N; j++) {
                    if (s.charAt(j) == 't') {

                        tcount++;
                        maxlen = j;
                        int t = maxlen - i + 1;
                        if (t <= 2 || tcount < 2) {
                            continue;
                        }
                        double ans = (double) (tcount - 2) / (t - 2);

                        totans = Math.max(ans, totans);
                    }

                }

            }
        }
        System.out.print(totans);
    }
}
