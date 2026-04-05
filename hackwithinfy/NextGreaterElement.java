package hackwithinfy;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        Stack<Integer> s = new Stack<>();
        for(int i=N-1;i>=0;i--){
            if(i==N-1 && s.isEmpty()){
                s.push(arr[i]);
                arr[i]=-1;
                
            }
            if(s.isEmpty()){
                arr[]
            }
        }
    }
}
