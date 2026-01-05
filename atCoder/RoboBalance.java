
import java.util.*;

public class RoboBalance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int c = sc.nextInt();
        if (h <= c) {
            System.out.println(0);
        } else {
            System.out.println(h - c);
        }
    }
}
