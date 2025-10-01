package codeforces;

import java.util.*;

public class IncrementalSubarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            int arrlength = sc.nextInt();
            int sub[] = new int[arrlength];
            for (int i = 0; i < arrlength; i++) {
                sub[i] = sc.nextInt();
            }
            ArrayList<Integer> arr = new ArrayList<>();
            int num = 1;
            while (num <= N) {
                for (int i = 1; i <= num; i++) {
                    arr.add(i);
                }
                num++;
            }
            int count = 0;
            for (int i = 0; i <= arr.size() - arrlength; i++) {
                int index = 0;
                boolean flag = true;
                for (int j = i; j < i + arrlength; j++) {
                    if (sub[index] != arr.get(j)) {
                        flag = false;

                    }
                    index++;
                }
                if (flag)
                    count++;
            }
            System.out.println(count);

        }
    }
}
