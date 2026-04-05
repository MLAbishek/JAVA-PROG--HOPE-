import java.util.*;

public class threetwoone {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while (N >= 1) {
            if (N == 1) {
                System.out.print(N);
                break;
            }

            System.out.print(N + ",");
            N--;
        }

    }
}










