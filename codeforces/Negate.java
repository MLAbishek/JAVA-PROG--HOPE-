package codeforces;

import java.util.*;

public class Negate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int arr[] = new int[7];
            int ind = 0;
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < 7; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                    ind = i;
                }
            }
            int sum = 0;
            for (int i = 0; i < 7; i++) {
                if (i != ind) {
                    sum = sum + (-1 * arr[i]);
                }
            }
            sum += max;
            System.out.println(sum);
        }
    }
}
