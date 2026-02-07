// package atCoder;

import java.util.*;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == 'i' || c == 'j') {
                count++;
            }
        }
        System.out.println(count);

    }
}
