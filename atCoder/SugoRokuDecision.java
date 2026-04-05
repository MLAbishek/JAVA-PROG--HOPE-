import java.util.*;

public class SugoRokuDecision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            arr[i] = sc.nextInt();
        }
        int[] dp = new int[N + 1];
        for (int i = N; i >= 1; i--) {
            if (arr[i] == i) {
                dp[i] = i;
            } else {
                dp[i] = dp[arr[i]];
            }
        }
        for (int i = 1; i <= N; i++) {
            System.out.print(dp[i] + " ");
        }
    }
}
