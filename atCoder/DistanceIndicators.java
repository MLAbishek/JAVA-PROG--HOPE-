
//package atCoder;
import java.util.*;

public class DistanceIndicators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < N - 1; i++) {
            for (int j = i + 1; j < N; j++) {
                if (j - i == arr[i] + arr[j]) {
                    count++;
                }
            }
        }
        System.out.println(count);
        sc.close();
    }
}
