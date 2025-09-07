
import java.util.*;

public class GetMinBalls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        int N = sc.nextInt();
        while (N-- > 0) {
            int query = sc.nextInt();
            if (query == 1) {
                int ele = sc.nextInt();
                minheap.add(ele);
            } else {
                System.out.println(minheap.poll());
            }
        }
    }
}
