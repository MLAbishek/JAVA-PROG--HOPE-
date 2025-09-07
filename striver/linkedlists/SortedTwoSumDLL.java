package striver.linkedlists;

import java.util.*;

// Definition for doubly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next, ListNode prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

class Sol {
    public List<List<Integer>> findPairsWithGivenSum(ListNode head, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ListNode right = head;
        if (head == null)
            return ans;
        while (right.next != null) {
            right = right.next;

        }
        ListNode left = head;
        while (left != right && left.prev != right) {
            int sum = left.val + right.val;
            if (sum == target) {
                ans.add(Arrays.asList(left.val, right.val));
                left = left.next;
                right = right.prev;
            } else if (sum < target) {
                left = left.next;
            } else {
                right = right.prev;
            }
        }
        return ans;

    }
}

// Test class
public class SortedTwoSumDLL {
    public static void main(String[] args) {
        Sol solution = new Sol();

        // Test 1: [1, 2, 4, 5, 6, 8, 9], target = 7
        ListNode head1 = createList(new int[] { 1, 2, 4, 5, 6, 8, 9 });
        List<List<Integer>> result1 = solution.findPairsWithGivenSum(head1, 7);
        System.out.println("Test 1: " + result1); // Expected: [[1, 6], [2, 5]]

        // Test 2: [1, 5, 6], target = 6
        ListNode head2 = createList(new int[] { 1, 5, 6 });
        List<List<Integer>> result2 = solution.findPairsWithGivenSum(head2, 6);
        System.out.println("Test 2: " + result2); // Expected: [[1, 5]]

        // Test 3: [2, 3, 5, 9], target = 12
        ListNode head3 = createList(new int[] { 2, 3, 5, 9 });
        List<List<Integer>> result3 = solution.findPairsWithGivenSum(head3, 12);
        System.out.println("Test 3: " + result3); // Expected: [[3, 9]]

        // Test 4: No pairs found
        ListNode head4 = createList(new int[] { 1, 2, 3 });
        List<List<Integer>> result4 = solution.findPairsWithGivenSum(head4, 10);
        System.out.println("Test 4: " + result4); // Expected: []

        // Test 5: Single node
        ListNode head5 = createList(new int[] { 5 });
        List<List<Integer>> result5 = solution.findPairsWithGivenSum(head5, 10);
        System.out.println("Test 5: " + result5); // Expected: []

        // Test 6: Two nodes that sum to target
        ListNode head6 = createList(new int[] { 3, 7 });
        List<List<Integer>> result6 = solution.findPairsWithGivenSum(head6, 10);
        System.out.println("Test 6: " + result6); // Expected: [[3, 7]]
    }

    // Helper method to create doubly linked list from array
    private static ListNode createList(int[] arr) {
        if (arr.length == 0)
            return null;

        ListNode head = new ListNode(arr[0]);
        ListNode prev = head;

        for (int i = 1; i < arr.length; i++) {
            ListNode curr = new ListNode(arr[i]);
            prev.next = curr;
            curr.prev = prev;
            prev = curr;
        }

        return head;
    }

    // Helper method to print the doubly linked list
    private static void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val);
            if (curr.next != null) {
                System.out.print(" <-> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }
}