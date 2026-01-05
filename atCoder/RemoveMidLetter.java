import java.util.Scanner;

public class RemoveMidLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int piv = s.length() / 2;
        for (int i = 0; i < s.length(); i++) {
            if (i != piv) {
                System.out.print(s.charAt(i));
            }
        }
    }
}
