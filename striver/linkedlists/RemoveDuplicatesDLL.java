package striver.linkedlists;

//import java.util.*;

// Definition for doubly-linked list.
class DoublyListNode {
    int val;
    DoublyListNode next;
    DoublyListNode prev;

    DoublyListNode(int val) {
        this.val = val;
    }

    DoublyListNode(int val, DoublyListNode next, DoublyListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class Solution2 {

    public DoublyListNode removeDuplicates(DoublyListNode head) {
        DoublyListNode left, right;
        left = head;
        right = head;
        if (head == null)
            return head;
        while (right != null) {
            left = right;
            while (right != null && left.val == right.val) {
                right = right.next;
            }
            if (right != null) {
                left.next = right;
                right.prev = left;
            } else {
                left.next = right;
            }

        }
        return head;
    }
}

public class RemoveDuplicatesDLL {
    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        // Example 1: 1 <-> 1 <-> 3 <-> 3 <-> 4 <-> 5
        DoublyListNode head1 = createList(new int[] { 1, 1, 3, 3, 4, 5 });
        head1 = sol.removeDuplicates(head1);
        printList(head1); // Expected: 1 <-> 3 <-> 4 <-> 5

        // Example 2: 1 <-> 1 <-> 1 <-> 1 <-> 1 <-> 2
        DoublyListNode head2 = createList(new int[] { 1, 1, 1, 1, 1, 2 });
        head2 = sol.removeDuplicates(head2);
        printList(head2); // Expected: 1 <-> 2

        // Example 3: 1 <-> 2 <-> 3
        DoublyListNode head3 = createList(new int[] { 1, 2, 3 });
        head3 = sol.removeDuplicates(head3);
        printList(head3); // Expected: 1 <-> 2 <-> 3
    }

    // Helper: create doubly linked list from array
    private static DoublyListNode createList(int[] arr) {
        if (arr.length == 0)
            return null;
        DoublyListNode head = new DoublyListNode(arr[0]);
        DoublyListNode prev = head;
        for (int i = 1; i < arr.length; i++) {
            DoublyListNode curr = new DoublyListNode(arr[i]);
            prev.next = curr;
            curr.prev = prev;
            prev = curr;
        }
        return head;
    }

    // Helper: print doubly linked list
    private static void printList(DoublyListNode head) {
        if (head == null) {
            System.out.println("null");
            return;
        }
        DoublyListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null)
                System.out.print(" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }
}
