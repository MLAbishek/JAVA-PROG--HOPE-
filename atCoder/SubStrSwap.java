import java.util.*;

//Time Limit Exceeded
public class SubStrSwap {
    private static void swapper(int index1, int index2, StringBuilder sb1, StringBuilder sb2) {
        index1--;
        index2--;
        for (int i = index1; i <= index2; i++) {
            char c = sb1.charAt(i);
            char d = sb2.charAt(i);
            sb2.setCharAt(i, c);
            sb1.setCharAt(i, d);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        String t = sc.nextLine();
        StringBuilder sb1 = new StringBuilder(s);
        StringBuilder sb2 = new StringBuilder(t);
        while (M-- > 0) {
            int index1 = sc.nextInt();
            int index2 = sc.nextInt();
            swapper(index1, index2, sb1, sb2);
        }
        System.out.println(sb1.toString());
    }
}
