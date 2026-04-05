package hackwithinfy;

import java.util.Scanner;

public class EvenStringReplace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = "";
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 1) {
                t = t + "E";
            } else {
                t = t + s.charAt(i);
            }
        }
        System.out.println(t);
    }
}
