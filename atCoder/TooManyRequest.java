
import java.util.*;

public class TooManyRequest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            if (i <= m) {
                System.out.println("OK");
            } else {
                System.out.println("Too Many Requests");
            }
        }
    }
}
