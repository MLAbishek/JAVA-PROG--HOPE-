package graphs;
import java.util.*;
public class FindDis {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v=sc.nextInt();
        int e=sc.nextInt();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<e;i++){
            int vert1=sc.nextInt();
            int vert2=sc.nextInt();
            adj.get(vert1).add(vert2);
            adj.get(vert2).add(vert1);
        }
        int dis[]=new int[v];
        Arrays.fill(dis,-1);
        //NOTE : Do not read this
    }
}
