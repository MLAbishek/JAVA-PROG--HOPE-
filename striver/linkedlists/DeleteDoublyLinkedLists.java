package striver.linkedlists;

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

class Solution {
    public DoublyListNode deleteTarget(DoublyListNode head, int target) {
        DoublyListNode curr = head;

        // Delete nodes while traversing
        while (curr != null) {
            if (curr.val == target) {
                if (curr.prev == null) {
                    head = curr.next;
                    if (head != null) {
                        head.prev = null;
                    }
                    curr = head;
                } else if (curr.next == null) {
                    curr.prev.next = null;
                    curr = null;
                } else {
                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                    curr = curr.next;
                }
            } else {
                curr = curr.next;
            }

        }
        return head;
    }
}

public class DeleteDoublyLinkedLists {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1: 1 <-> 2 <-> 3 <-> 1 <-> 4, target=1
        DoublyListNode head1 = createList(new int[] { 1, 2, 3, 1, 4 });
        head1 = sol.deleteTarget(head1, 1);
        printList(head1);

        // Test 2: 2 <-> 3 <-> -1 <-> 4 <-> 2, target=2
        DoublyListNode head2 = createList(new int[] { 2, 3, -1, 4, 2 });
        head2 = sol.deleteTarget(head2, 2);
        printList(head2);

        // Test 3: 7 <-> 7 <-> 7 <-> 7, target=7
        DoublyListNode head3 = createList(new int[] { 7, 7, 7, 7 });
        head3 = sol.deleteTarget(head3, 7);
        printList(head3); // Expected: null
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
