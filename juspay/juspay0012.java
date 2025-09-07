package juspay;

//Customer Satisfaction Score
import java.util.*;

public class juspay0012 {
    private static int getmax(TreeMap<Integer, Integer> tm) {
        return tm.firstKey();
    }

    private static void add(TreeMap<Integer, Integer> tm, int[] arr, int i) {
        int count = tm.getOrDefault(arr[i], 0);
        tm.put(arr[i], count + 1);
    }

    private static void remove(TreeMap<Integer, Integer> tm, int[] arr, int i) {
        int count = tm.get(arr[i]);
        if (count == 1) {
            tm.remove(arr[i]);
        } else {
            tm.put(arr[i], count - 1);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n, q;
        n = sc.nextInt();
        q = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < q; i++) {
            int windsize = sc.nextInt();
            TreeMap<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());
            for (int j = 0; j < windsize; j++) {
                add(tm, arr, j);
            }
            int minAmongMax = tm.firstKey();
            for (int ind = 1; ind + windsize - 1 < n; ind++) {
                remove(tm, arr, ind - 1);
                add(tm, arr, ind + windsize - 1);
                int max = getmax(tm);
                minAmongMax = Math.min(max, minAmongMax);

            }
            System.out.println(minAmongMax);

        }
        sc.close();

    }
}