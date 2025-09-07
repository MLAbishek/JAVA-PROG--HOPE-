//package atCoder;

import java.util.*;

public class A_substring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, A, B;
        N = sc.nextInt();
        A = sc.nextInt();
        B = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for (int i = A; i < N - B; i++) {
            sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());
        sc.close();
    }
}
