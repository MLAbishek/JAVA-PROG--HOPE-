import java.util.*;

public class RoboWeight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(i, false);
        }
        int t = sc.nextInt();
        while (t-- > 0) {
            int part = sc.nextInt() - 1;
            if (!map.get(part)) {
                total += arr[part];
                map.put(part, true);

            } else {
                total -= arr[part];
                map.put(part, false);
            }
            System.out.println(total);
        }
    }
}
