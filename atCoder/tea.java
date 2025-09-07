//package atCoder;

import java.util.*;

public class tea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String check = "tea";
        int index = 2;
        boolean flag = true;
        if (N >= 3) {
            for (int i = N - 1; i >= N - 3; i--) {
                if (s.charAt(i) == check.charAt(index)) {
                    index--;
                } else {

                    flag = false;
                    break;
                }

            }
            if (flag) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}
