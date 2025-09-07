import java.util.*;

public class ReveseFibonacci {
    private static long reverse(long n) {
        long num = 0;
        while (n > 0) {
            long rem = n % 10;
            num = (num * 10) + rem;
            n = n / 10;
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        // a = reverse(a);
        // b = reverse(b);
        long c = 0;
        for (int i = 1; i <= 8; i++) {
            c = reverse(a + b);
            a = b;
            b = c;

        }
        System.out.println(c);

    }
}
