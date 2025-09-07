package striver.linkedlists;

// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public ListNode sortList(ListNode head) {
        // write the code here
        int zero = 0, one = 0, two = 0;
        ListNode ptr = head;
        while (ptr != null) {
            if (ptr.val == 0) {
                zero++;
            } else if (ptr.val == 1) {
                one++;
            } else {
                two++;
            }
            ptr = ptr.next;
        }
        ptr = head;
        while (zero-- > 0) {
            ptr.val = 0;
            ptr = ptr.next;
        }
        while (one-- > 0) {
            ptr.val = 1;
            ptr = ptr.next;
        }
        while (two-- > 0) {
            ptr.val = 2;
            ptr = ptr.next;
        }
        return head;
    }

}

// Test cases
public class sort012 {
    public static void main(String[] args) {
        Solution sol = new Solution();

        // Test 1
        ListNode head1 = createList(new int[] { 1, 0, 2, 0, 1 });
        head1 = sol.sortList(head1);
        printList(head1); // Expected: 0 -> 0 -> 1 -> 1 -> 2

        // Test 2
        ListNode head2 = createList(new int[] { 1, 1, 1, 0 });
        head2 = sol.sortList(head2);
        printList(head2); // Expected: 0 -> 1 -> 1 -> 1

        // Test 3
        ListNode head3 = createList(new int[] { 2, 2, 1, 2 });
        head3 = sol.sortList(head3);
        printList(head3); // Expected: 1 -> 2 -> 2 -> 2

        // Test 4: Empty list
        ListNode head4 = createList(new int[] {});
        head4 = sol.sortList(head4);
        printList(head4); // Expected: (empty)
    }

    // Helper to create list
    private static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int val : arr) {
            curr.next = new ListNode(val);
            curr = curr.next;
        }
        return dummy.next;
    }

    // Helper to print list
    private static void printList(ListNode head) {
        if (head == null) {
            System.out.println("Empty List");
            return;
        }
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
