import java.util.*;

public class LockedRooms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++)
            arr[i] = sc.nextInt();
        int ans1 = -1;
        int p1 = 0;
        while (p1 < N) {
            if (arr[p1] == 1) {
                ans1 = p1;
                break;
            }
            p1++;
        }
        int ans2 = -1;
        int p2 = N - 1;
        while (p2 >= 0) {
            if (arr[p2] == 1) {
                ans2 = p2;
                break;
            }
            p2--;
        }
        System.out.println(Math.abs(ans1 - ans2));
    }
}
