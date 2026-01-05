import java.util.HashMap;
import java.util.Scanner;

public class OsVersions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        String s1 = s[0];
        String s2 = s[1];
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ocelot", 1);
        map.put("Serval", 2);
        map.put("Lynx", 3);
        int n1 = map.get(s1);
        int n2 = map.get(s2);
        if (n1 >= n2) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
