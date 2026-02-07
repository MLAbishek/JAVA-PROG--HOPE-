import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int i = 0; i <= n; i++) {
            if (sum(i) == k) {
                count++;
            }
        }
        System.out.println(count);
    }

    private static int sum(int n) {
        int ans = 0;
        while (n > 0) {
            ans += (n % 10);
            n = n / 10;
        }
        return ans;
    }
}
