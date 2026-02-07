import java.util.*;

public class setsunbun {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int st = sc.nextInt();
        int total = sc.nextInt();
        if (st >= total) {
            System.out.println(0);
            return;
        }
        long sum = 0;
        long curr = st;
        long count = 0;
        while (true) {
            sum += curr;
            if (sum >= total) {
                break;
            }
            curr++;
            count++;
        }
        System.out.println(count);
    }
}
