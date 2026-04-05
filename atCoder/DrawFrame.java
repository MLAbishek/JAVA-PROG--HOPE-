import java.util.*;

public class DrawFrame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int R = sc.nextInt();
        int C = sc.nextInt();
        for (int r = 0; r < R; r++) {
            if (r == 0 || r == R - 1) {
                for (int c = 0; c < C; c++) {
                    System.out.print("#");

                }
                System.out.println();
            } else {
                if (C == 1) {
                    System.out.println("#");
                    continue;
                }
                System.out.print("#");
                for (int c = 0; c < C - 2; c++) {
                    System.out.print(".");
                }

                System.out.print("#");
                System.out.println();
            }
        }
    }
}
