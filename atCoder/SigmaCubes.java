import java.util.*;

public class SigmaCubes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                ans += (long) (Math.pow(i, 3));
            } else {
                ans += -1 * ((long) (Math.pow(i, 3)));
            }
        }
        System.out.println(ans);
    }
}
