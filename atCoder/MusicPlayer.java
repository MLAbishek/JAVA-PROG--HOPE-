import java.util.*;

public class MusicPlayer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int vol = 0;
        boolean stop = true;
        while (N-- > 0) {
            int choice = sc.nextInt();
            if (choice == 1) {
                vol++;
            } else if (choice == 2) {
                if (vol > 0) {
                    vol--;
                }
            } else {
                stop = !stop;
            }
            if (vol >= 3 && !stop) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
