package randompractice;

import java.util.*;

public class MonocarpStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- != 0) {
            int n = sc.nextInt();
            String s = sc.next();
            Map<Integer, Integer> map = new HashMap<>();
            int nd = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'a') {
                    nd++;

                } else {
                    nd--;
                }
            }
            if (nd == 0) {
                System.out.println(0);
                continue;
            }
            map.put(0, -1);
            int min = Integer.MAX_VALUE;
            int ans = 0;
            for (int i = 0; i < n; i++) {
                char c = s.charAt(i);
                if (c == 'a') {
                    ans++;

                } else {
                    ans--;
                }
                int tar = ans - nd;
                if (map.containsKey(tar)) {
                    min = Math.min(min, i - map.get(tar));
                }

                map.put(ans, i);
            }
            System.out.println(min == n ? -1 : min);
        }
    }
}