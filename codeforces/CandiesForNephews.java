package codeforces;

import java.util.Scanner;

public class CandiesForNephews {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int q = n / 3;
            if (n % 3 == 0)
                System.out.println(0);
            else
                System.out.println((3 * (q + 1)) - n);
        }
    }
}
