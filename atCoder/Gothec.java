import java.util.*;

public class Gothec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        if (m == 1 && d == 7) {
            System.out.print("Yes");
        } else if (m == 3 && d == 3) {
            System.out.print("Yes");
        } else if (m == 5 && d == 5) {
            System.out.print("Yes");
        } else if (m == 7 && d == 7) {
            System.out.print("Yes");
        } else if (m == 9 && d == 9) {
            System.out.print("Yes");
        } else {
            System.out.println("No");
        }

    }
}