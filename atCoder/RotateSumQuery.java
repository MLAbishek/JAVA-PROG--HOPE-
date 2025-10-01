import java.util.*;

public class RotateSumQuery {
    private static void reverse(int[] arr, int l, int r) {
        if (arr.length == 1)
            return;
        while (l <= r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

    }

    // private static void print(int arr[]) {
    // System.out.println("The array is");
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // System.out.println();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Q = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        while (Q-- > 0) {
            int o = sc.nextInt();
            if (o == 1) {
                int time = sc.nextInt();
                while (time-- > 0) {
                    reverse(arr, 1, N - 1);
                    reverse(arr, 0, N - 1);
                }
            }
            if (o == 2) {
                int ans = 0;
                int s = sc.nextInt();
                int e = sc.nextInt();
                int start = s - 1;
                int end = e - 1;
                for (int i = start; i < e; i++) {
                    ans += arr[i];
                }
                System.out.println(ans);
            }
        }
    }
}
