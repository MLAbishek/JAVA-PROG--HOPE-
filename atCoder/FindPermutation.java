import java.util.*;

public class FindPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N + 1];
        int num[] = new int[N];

        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
            if (num[i] != -1) {
                arr[num[i]]++;
                if (arr[num[i]] > 1) {
                    System.out.println("No");
                    return;
                }
            }
        }
        int val = 1;
        for (int i = 0; i < N; i++) {
            if (num[i] == -1) {
                while (arr[val] != 0) {
                    val++;
                }
                num[i] = val;
                arr[val]++;
            }
        }
        System.out.println("Yes");
        for (int i = 0; i < N; i++) {
            System.out.print(num[i] + " ");
        }

    }
}
