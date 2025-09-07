package codeforces;

import java.util.*;

public class HomeWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N-- > 0) {
            int na = sc.nextInt();
            sc.nextLine();
            String a = sc.nextLine();
            int nb = sc.nextInt();
            sc.nextLine();

            String b = sc.nextLine();
            String order = sc.nextLine();
            StringBuilder sb = new StringBuilder(a);
            int index = 0;
            for (char c : order.toCharArray()) {
                if (c == 'D') {
                    sb.append(b.charAt(index));
                    index++;

                }
                if (c == 'V') {
                    sb.insert(0, b.charAt(index));
                    index++;
                }
            }
            System.out.println(sb.toString());

        }
    }
}
