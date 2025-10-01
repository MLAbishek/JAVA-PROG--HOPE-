import java.util.*;

public class isoceles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a == b || b == c || a == c) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
