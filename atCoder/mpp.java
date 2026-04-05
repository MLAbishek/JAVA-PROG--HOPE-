import java.util.*;

public class mpp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int arr[] = new int[26];
        int maxfreq = 0;
        for (char c : s.toCharArray()) {
            arr[c - 'a']++;
            maxfreq = Math.max(arr[c - 'a'], maxfreq);
        }
        for (char c : s.toCharArray()) {
            if (arr[c - 'a'] == maxfreq) {
                continue;
            }
            System.out.print(c);
        }
    }
}
