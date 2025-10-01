import java.util.*;

public class ScaryFee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int c = sc.nextInt();
        for (int i = x; i > 0; i = i - 1000) {
            if ((i * (1 + (c / 1000))) < x) {
                int tot = i * (1 + (c / 1000));
                System.out.println(i + " " + x + " " + tot);
                return;
            }
        }
        System.out.println(0);
    }
}
