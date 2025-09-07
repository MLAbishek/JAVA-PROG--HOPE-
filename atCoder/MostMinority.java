import java.util.*;

public class MostMinority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String vote[] = new String[N];
        for (int i = 0; i < N; i++) {
            vote[i] = sc.nextLine();
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i <= N; i++) {
            map.put(i, 0);
        }
        int round = 0;
        while (round < M) {
            int[] scores = new int[N];
            int one = 0;
            int zero = 0;
            // if non voted leave it
            // else mark as 1
            // 0 indexed so members are x-1
            for (int r = 0; r < N; r++) {
                if (vote[r].charAt(round) == '1') {
                    scores[r] = 1;
                    one++;
                } else {
                    zero++;
                }
            }
            if (one == 0 || zero == 0) {
                for (int i = 1; i <= N; i++) {
                    map.put(i, map.getOrDefault(i, 0) + 1);
                }
            } else if (zero < one) {
                for (int i = 1; i <= N; i++) {
                    if (scores[i - 1] == 0)
                        map.put(i, map.getOrDefault(i, 0) + 1);
                }
            } else {
                for (int i = 1; i <= N; i++) {
                    if (scores[i - 1] == 1)
                        map.put(i, map.getOrDefault(i, 0) + 1);
                }
            }
            round++;

        }
        int max = Integer.MIN_VALUE;
        for (int k : map.keySet()) {
            max = Math.max(max, map.get(k));
        }
        for (int k : map.keySet()) {
            if (map.get(k) == max) {
                System.out.print(k + " ");
            }
        }

    }
}
