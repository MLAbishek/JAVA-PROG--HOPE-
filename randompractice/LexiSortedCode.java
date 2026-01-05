import java.util.*;

public class LexiSortedCode {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[] = new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            map.put(arr[i], i);
        }
        Integer nums[] = new Integer[m];
        for (int i = 0; i < m; i++) {
            nums[i] = sc.nextInt();
        }
        Arrays.sort(

                nums, (a, b) -> {
                    char ar[] = String.valueOf(a).toCharArray();
                    char br[] = String.valueOf(b).toCharArray();
                    int len = Math.min(ar.length, br.length);
                    for (int i = 0; i < len; i++) {
                        int p1 = map.getOrDefault(ar[i] - '0', Integer.MAX_VALUE);
                        int p2 = map.getOrDefault(br[i] - '0', Integer.MAX_VALUE);
                        if (p1 != p2)
                            return p1 - p2;
                    }
                    return ar.length - br.length;
                }

        );
        System.out.println(Arrays.toString(nums));

    }
}
