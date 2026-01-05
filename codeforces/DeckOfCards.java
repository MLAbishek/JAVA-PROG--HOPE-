package codeforces;

import java.util.*;

public class DeckOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            // sc.nextLine();
            String s = sc.next();
            char[] arr = new char[n];
            Arrays.fill(arr, '-');
            int i = 0;
            int j = n - 1;
            for (char c : s.toCharArray()) {
                if (c == '0') {
                    arr[i] = '-';
                    i++;
                }
                if (c == '1') {
                    arr[j] = '-';
                    j--;
                }
                if (c == '2') {
                    arr[i] = '?';
                    arr[j] = '?';
                    i++;
                    j--;
                }
            }
            for (int ind = 0; ind < n; ind++) {
                System.out.print(arr[i]);
            }
        }
    }
}
