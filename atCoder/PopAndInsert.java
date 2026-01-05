import java.util.*;

public class PopAndInsert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            sc.nextLine();
            String s = sc.nextLine();
            int ans = Integer.MAX_VALUE;
            int zero = 0;
            int one = 0;
            for (char c : s.toCharArray()) {
                if (c == '0')
                    zero++;
                else
                    one++;
            }
            int j = 0;
            int i = 0;
            char[] arr = s.toCharArray();
            while (i < n) {
                j = i + 1;

                while (j < n && arr[j - 1] == arr[j]) {
                    j++;

                }
                int count = j - i;

            }

        }
    }
}
