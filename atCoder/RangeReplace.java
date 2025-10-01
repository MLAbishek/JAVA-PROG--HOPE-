import java.util.*;

public class RangeReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        Set<int[]> set = new HashSet<>();

        for (int j = 1; j < N; j++) {
            int temp[] = Arrays.copyOf(arr, N);
            for (int i = 0; i <= j; i++) {
                for (int k = i; k <= j; k++) {
                    temp[k] = temp[i];
                }
                set.add(temp);
            }
        }

        System.out.println(set.size() + 1);
    }
}
