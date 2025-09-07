import java.util.*;

public class KingSummit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxrow = Integer.MIN_VALUE;
        int maxcol = Integer.MIN_VALUE;
        int mincol = Integer.MAX_VALUE;
        int minrow = Integer.MAX_VALUE;
        while (N-- > 0) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            maxrow = Math.max(maxrow, r);
            maxcol = Math.max(maxcol, c);
            minrow = Math.min(minrow, r);
            mincol = Math.min(mincol, c);

        }
        int rowdis = maxrow - minrow;
        int coldis = maxcol - mincol;
        rowdis = rowdis / 2;
        coldis = coldis / 2;
        if (rowdis > coldis) {
            System.out.println(rowdis);
        } else {
            System.out.println(coldis);
        }
    }
}
