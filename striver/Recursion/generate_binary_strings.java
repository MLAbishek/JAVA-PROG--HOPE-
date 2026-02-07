package Recursion;

import java.util.*;

public class generate_binary_strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> ans = new ArrayList<>();
        helper("", ans, 0, N);
        for (String s : ans) {
            System.out.print(s + " ");
        }

    }

    private static void helper(String s, ArrayList<String> ans, int n, int N) {
        if (n == N) {
            if (!ans.contains(s)) {
                ans.add(s);
            }
            return;
        }
        if (s.length() != 0 && s.charAt(s.length() - 1) == '1') {
            helper(s + "0", ans, n + 1, N);
        } else {
            helper(s + "0", ans, n + 1, N);
            helper(s + "1", ans, n + 1, N);
        }
    }

}
