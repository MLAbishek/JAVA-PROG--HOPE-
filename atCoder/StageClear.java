import java.util.*;

public class StageClear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int i = s.charAt(0) - '0';
        int j = s.charAt(2) - '0';
        if (j < 8) {
            System.out.println(i + "-" + (j + 1));
        }

        else if (i < 8 && j == 8) {
            System.out.println(i + 1 + "-" + 1);
        } else {
            System.out.println(8 + "-" + 8);
        }
    }
}
