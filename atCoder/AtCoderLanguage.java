import java.util.*;

public class AtCoderLanguage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        if (s.equals("red")) {
            System.out.println("SSS");
        } else if (s.equals("blue")) {
            System.out.println("FFF");
        } else if (s.equals("green")) {
            System.out.println("MMM");
        } else {
            System.out.println("Unknown");
        }
    }
}