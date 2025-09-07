package llist;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class lltoarray {
    public static Node converter(int[] arr) {
        Node head = new Node(arr[0]);
        Node ptr = head;
        for (int i = 1; i < arr.length; i++) {
            ptr.next = new Node(arr[i]);
            ptr = ptr.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 10, 100, 1000, 10000 };
        Node head = converter(arr);
        Node ptr = head;
        while (ptr != null) {
            System.out.print(ptr.data + "->");
            ptr = ptr.next;
        }
        System.out.println("None");
    }

}
