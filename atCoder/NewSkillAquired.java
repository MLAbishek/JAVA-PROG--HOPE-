import java.util.*;

public class NewSkillAquired {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        boolean flag[] = new boolean[N + 1];
        int count = 0;
        for (int i = 1; i <= N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (a == 0 && b == 0) {
                count++;
                flag[i] = true;
            } else {
                if (flag[a] || flag[b]) {
                    count++;
                    flag[i] = true;

                }
            }
        }
        System.out.println(count);
    }
}
