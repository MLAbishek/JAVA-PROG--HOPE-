import java.util.*;

public class RepDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int o = n % 10;
        while (n > 0) {
            int rem = n % 10;
            if (rem != o) {
                System.out.println("No");
                return;
            }
            n = n / 10;
        }
        System.out.println("Yes");
    }
}
