import java.util.*;

public class CenterAlignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        int maxlen = 0;
        String str[] = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.nextLine();
            maxlen = Math.max(maxlen, str[i].length());

        }
        String dot = ".";
        for (int i = 0; i < N; i++) {
            int len = str[i].length();
            int rem = maxlen - len;
            StringBuilder sb = new StringBuilder();
            sb.append(dot.repeat(rem / 2));
            sb.append(str[i]);
            sb.append(dot.repeat(rem / 2));
            System.out.println(sb.toString());

        }

    }
}
