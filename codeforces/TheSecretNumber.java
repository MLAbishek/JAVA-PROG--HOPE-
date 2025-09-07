package codeforces;

import java.util.*;

//WRONG ANSWER
public class TheSecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();
        while (testcase-- > 0) {
            int num = sc.nextInt();
            int len = String.valueOf(num).length();
            if (len == 1) {
                System.out.println(1);
                System.out.println(num);

            } else {
                if (num % 11 != 0 && len % 2 != 0) {
                    System.out.println(0);
                } else {
                    int count = 1;
                    if (len < 6) {
                        System.out.println((int) Math.ceil((double) (6 / len)));
                    } else {
                        System.out.println(len / 6);
                    }
                }
            }
        }
    }
}
