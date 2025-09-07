import java.util.*;

public class SumOfMinQuery {
    public static void main(String[] args) {
        int R, Q;
        Scanner sc = new Scanner(System.in);
        R = sc.nextInt();
        Q = sc.nextInt();
        long a[] = new long[R];
        long b[] = new long[R];
        for (int i = 0; i < R; i++) {
            a[i] = sc.nextLong();
        }
        for (int i = 0; i < R; i++) {
            b[i] = sc.nextLong();
        }
        while (Q-- > 0) {
            sc.nextLine();
            char arr = sc.next().charAt(0);
            int index = sc.nextInt();
            long val = sc.nextLong();

            if (arr == 'A') {
                a[index - 1] = val;
            } else {
                b[index - 1] = val;
            }
            int point = 0;
            for (int i = 0; i < R; i++) {
                point += Math.min(a[i], b[i]);
            }
            System.out.println(point);
        }
    }
}
