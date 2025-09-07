import java.util.*;
// Wrong answer
public class All_winners {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            int team = sc.nextInt();
            int player = sc.nextInt();
            if(team==1){
                System.out.println(0);
            }
            int ans = (team - 1) * player / 2;
            System.out.println(ans);
        }
    }
}
