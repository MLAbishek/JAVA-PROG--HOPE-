package randompractice;

import java.util.*;

public class CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (arr[i] - 1 <= res) {
                res += arr[i];
            } else {
                break;
            }
        }
        System.out.println(res);
    }
}
