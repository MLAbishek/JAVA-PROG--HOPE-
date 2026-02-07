import java.util.*;

public class Chokutter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long ans = 0;
        int N = sc.nextInt();

        int end = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        if (N == 0) {
            System.out.println(end);
            return;
        }
        int start = 0;
        int brake = Integer.MAX_VALUE;
        boolean open = true;
        for (int i = 0; i < N; i++) {
            if (start <= arr[i]) {
                ans += (arr[i] - start);
                start = arr[i] + 100;

            }
        }
        if (start < end) {
            ans += (end - start);
        }
        System.out.println(ans);
    }
}
