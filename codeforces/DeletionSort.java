package codeforces;

import java.util.Scanner;

public class DeletionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int len = sc.nextInt();
            int arr[] = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            for (int i = 0; i < len - 1; i++) {
                if (arr[i] > arr[i + 1])
                    count++;
            }
            if (count > 0) {
                System.out.println(1);
            } else {
                System.out.println(len);
            }
        }
    }
}
