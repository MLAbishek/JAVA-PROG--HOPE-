import java.util.*;

public class chmin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int x = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int ele = sc.nextInt();
            if (ele < x) {
                System.out.println(1);
                x = ele;
            } else {
                System.out.println(0);
            }
        }
    }
}
