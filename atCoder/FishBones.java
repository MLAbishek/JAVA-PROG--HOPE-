import java.util.*;

public class FishBones {
    public static void main(String[] args) {
        // Wrong unfinished worst solution
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int spine[][] = new int[N][2];
        for (int i = 0; i < N; i++) {
            spine[i][0] = sc.nextInt();
            spine[i][1] = sc.nextInt();
        }
        int M = sc.nextInt();
        sc.nextLine();
        String word[] = new String[M];
        for (int j = 0; j < M; j++) {
            word[j] = sc.nextLine();
        }
        for (String str : word) {
            if (str.length() != N) {
                System.out.println("No");
                continue;
            }
            for (int ind = 0; ind < N; ind++) {
                boolean found = false;
                for (String sen : word) {
                    if (sen.length() == spine[ind][0] && sen.charAt(spine[ind][1]) == str.charAt(ind)) {
                        found = true;
                        break;
                    }
                }
                if (!found) {
                    System.out.println("No");
                    break;
                }

            }
            System.out.println("Yes");

        }
    }
}
