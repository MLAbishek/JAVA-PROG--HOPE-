import java.util.Scanner;

public class PepperAddiction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int arr[] = new int[M + 1];
        for (int i = 0; i < M; i++) {
            arr[i + 1] = sc.nextInt();
        }
        long tot = 0;
        while (N-- > 0) {
            int pep = sc.nextInt();
            int req = sc.nextInt();
            if (arr[pep] != 0) {
                if (arr[pep] >= req) {
                    arr[pep] = arr[pep] - req;
                    tot += req;
                } else {
                    tot += arr[pep];
                    arr[pep] = 0;
                }
            }
        }
        System.out.println(tot);
    }
}
