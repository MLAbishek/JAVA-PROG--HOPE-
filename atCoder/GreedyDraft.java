import java.util.*;

public class GreedyDraft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int N = sc.nextInt();
        boolean juice[] = new boolean[N + 1];
        while (T-- > 0) {
            int o = sc.nextInt();
            boolean found = false;
            while (o-- > 0) {
                int opt = sc.nextInt();
                if (!juice[opt] && !found) {
                    System.out.println(opt);
                    juice[opt] = true;
                    found = true;

                }
            }
            if (!found)
                System.out.println(0);

        }
    }
}
