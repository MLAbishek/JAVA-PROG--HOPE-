import java.util.*;

public class Alterted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int count = 0;
        int j = 0;
        int i = 0;
        while (i < s.length()) {
            i = j;
            while (j < s.length() && sb.charAt(i) == sb.charAt(j)) {
                j++;
            }
            if (i + 1 != j) {
                char a = sb.charAt(i + 1);
                char b = sb.charAt(j);
                sb.setCharAt(i + 1, b);
                sb.setCharAt(j, a);
                count++;
            }
            i = i + 1;
        }
        System.out.println(count);
    }
}
