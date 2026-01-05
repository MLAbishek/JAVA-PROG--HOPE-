package Recursion;

import java.util.*;

public class sort_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < N; i++) {
            s.add(sc.nextInt());
        }
        sort(s);
        for (int i : s) {
            System.out.print(i + " ");
        }

    }

    private static void sort(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int temp = s.pop();
        sort(s);
        inserts(s, temp);

    }

    private static void inserts(Stack<Integer> s, int n) {
        if (s.isEmpty() || s.peek() >= n) {
            s.add(n);
            return;

        }
        int temp = s.pop();
        inserts(s, n);
        inserts(s,temp);
    }
}