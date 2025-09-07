package codeforces;

import java.util.*;

public class WasteCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();

        for (int i = 0; i < testcases; i++) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            ArrayList<Long> waste = new ArrayList<>();

            boolean flag = false;
            for (int ind = 0; ind < n; ind++) {
                long ele = sc.nextLong();
                waste.add(ind, ele);

            }
            int coin = 0;
            while (waste.size() > 0) {
                long maxWiLim = Long.valueOf(Integer.MIN_VALUE);
                int index = 0;
                for (int j = 0; j < waste.size(); j++) {
                    long curr = waste.get(j);
                    if (curr <= c) {
                        if (curr > maxWiLim) {
                            index = j;
                            maxWiLim = curr;
                        }
                        flag = true;

                    }
                }
                for (int k = 0; k < waste.size(); k++) {
                    if (k != index) {
                        waste.set(k, waste.get(k) * 2);
                    }
                }
                if (flag) {
                    flag = false;
                    waste.remove(Long.valueOf(maxWiLim));
                    continue;
                } else {
                    coin += waste.size();
                    break;
                }
            }
            System.out.println(coin);

        }
        sc.close();
    }

}
