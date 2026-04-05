import java.util.*;

public class Seat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int seat = sc.nextInt();
        int mem = sc.nextInt();
        int avail = 0;
        if (seat % 2 == 0)
            avail = (int) (Math.ceil(seat / 2));
        else
            avail = (int) (Math.ceil((seat + 1) / 2));

        if (avail >= mem) {
            System.out.println("Yes");

        } else {
            System.out.println("No");
        }
    }
}
