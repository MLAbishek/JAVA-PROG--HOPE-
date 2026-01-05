package codeforces;

import java.util.*;

public class oneLove {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n-- > 0) {
            int len = sc.nextInt();
            int a[] = new int[26];
            int b[] = new int[26];
            sc.nextLine();
            String s = sc.nextLine();
            String words[] = s.split(" ");
            for (int i = 0; i < len; i++) {
                a[words[0].charAt(i) - 'a']++;
                b[words[1].charAt(i) - 'a']++;

            }
            boolean yes = true;
            for (int ind = 0; ind < 26; ind++) {
                if (a[ind] != b[ind]) {
                    System.out.println("NO");
                    yes = false;
                    break;
                }

            }
            if (yes)
                System.out.println("YES");

        }
    }
}
