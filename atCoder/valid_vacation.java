//package atCoder;

import java.util.*;

public class valid_vacation {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N, L, R;
        N = sc.nextInt();
        L = sc.nextInt();
        R = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        int flag = 1;
        for (int i = L - 1; i < R; i++) {
            if (s.charAt(i) == 'x') {
                flag = 0;
            }
        }
        if (flag == 0) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
        sc.close();
    }
}