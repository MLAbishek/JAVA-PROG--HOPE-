import java.util.*;

public class StrongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int N = s.length();
        if (s.charAt(0) == s.charAt(N - 1)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
