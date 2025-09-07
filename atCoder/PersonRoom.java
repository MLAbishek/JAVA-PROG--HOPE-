import java.util.Scanner;

public class PersonRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String arr[] = new String[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextLine();
        }
        int pos = sc.nextInt();
        String name = sc.nextLine().strip();
        if (arr[pos - 1].equals(name))
            System.out.println("Yes");
        else
            System.out.println("No ");
    }
}
