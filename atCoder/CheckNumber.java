import java.util.*;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int arr[] = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];

        }
        if (sum < t) {
            System.out.println("No");
        } else {
            int want = sum - t;
            for (int i = 0; i < n; i++) {
                if (arr[i] == want) {
                    System.out.println("Yes");
                    return;
                }

            }
            System.out.println("No");
        }

    }
}
