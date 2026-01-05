import java.util.*;

public class SumOfDigit {

    static int sumdig(long x) {
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long[] arr = new long[N + 1];
        int[] digitSum = new int[N + 1];
        long[] prefix = new long[N + 1];

        arr[0] = 1;
        digitSum[0] = sumdig(arr[0]);
        prefix[0] = digitSum[0];

        for (int i = 1; i <= N; i++) {
            arr[i] = prefix[i - 1];
            digitSum[i] = sumdig(arr[i]);
            prefix[i] = prefix[i - 1] + digitSum[i];
        }

        System.out.println(arr[N]);
    }
}
