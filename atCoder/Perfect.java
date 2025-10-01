import java.util.*;

public class Perfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N, M, K;
        N = sc.nextInt();
        M = sc.nextInt();
        K = sc.nextInt();
        int arr[] = new int[N + 1];
        for (int i = 0; i < K; i++) {
            int p = sc.nextInt();
            int c = sc.nextInt();
            arr[p]++;
            if (arr[p] == M) {
                System.out.print(p + " ");
            }
        }
    }
}
