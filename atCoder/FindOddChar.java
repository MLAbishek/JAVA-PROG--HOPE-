import java.util.*;

public class FindOddChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                if (i == s.length() - 2) {
                    System.out.println(s.charAt(i + 1));
                    return;
                }
                if (s.charAt(i + 1) != s.charAt(i + 2)) {
                    System.out.println(s.charAt(i + 1));
                    return;
                } else {
                    System.out.println(s.charAt(i));
                    return;
                }
            }
        }
    }

}
