package Recursion;

import java.util.*;

public class reverse_stack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < N; i++) {
            s.push(sc.nextInt());
        }
        reverse(s);
        for (int i : s) {
            System.out.print(i + " ");
        }
    }

    private static void reverse(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }
        int ele = s.pop();
        reverse(s);
        insert_at_end(s, ele);
    }

    private static void insert_at_end(Stack<Integer> s, int e) {
        if (s.isEmpty()) {
            s.add(e);
            return;
        }
        int ele = s.pop();
        insert_at_end(s, e);
        s.add(ele);
    }
}
