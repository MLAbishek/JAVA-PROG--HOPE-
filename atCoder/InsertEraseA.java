import java.util.*;

public class InsertEraseA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int i = 0;
        int j = 0;
        int N = s1.length();
        int M = s2.length();
        int coua1 = 0;
        int coua2 = 0;
        int ans = 0;
        while (i < N && j < M) {
            while (i < N && s1.charAt(i) == 'A') {
                coua1++;
                i++;
            }
            while (j < M && s2.charAt(j) == 'A') {
                coua2++;
                j++;
            }
            if (i < N && j < M && s1.charAt(i) == s2.charAt(j)) {

                ans += Math.abs(coua1 - coua2);
                coua1 = 0;
                coua2 = 0;
                i++;
                j++;
            } else {

                break;
            }
        }
        while (j < M && s2.charAt(j) == 'A') {
            coua2++;
            j++;
        }
        while (i < N && s1.charAt(i) == 'A') {
            coua1++;
            i++;
        }
        if (i == N && j == M) {
            ans += Math.abs(coua1 - coua2);
            System.out.println(ans);

        } else {
            System.out.println(-1);
        }
    }
}
