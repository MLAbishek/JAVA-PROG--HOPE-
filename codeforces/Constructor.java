package codeforces;

import java.util.*;

public class Constructor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int num = sc.nextInt();
            int arr[] = new int[num * 2];

            for (int i = 1; i <= num; i++) {
                arr[i - 1] = i;
                arr[i - 1 + i] = i;
            }
            for (int a : arr) {
                if (a == 0)
                    System.out.print(1 + " ");
                else
                    System.out.print(a + " ");
            }
            System.out.println();
        }
    }
}
