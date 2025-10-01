package Trees;''

import java.util.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int d) {
        this.data = d;
        TreeNode left = null;
        TreeNode right = null;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(sc.nextInt());
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode r = q.poll();
            int left = sc.nextInt();
            int right = sc.nextInt();
            if (left != -1) {
                r.left = new TreeNode(left);
                q.add(r.left);
            }
            if (right != -1) {
                r.right = new TreeNode(right);
                q.add(r.right);
            }
        }
        System.out.println(root.left.data + " " + root.right.data);
    }
}