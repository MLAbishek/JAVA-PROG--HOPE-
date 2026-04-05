package Trees;

import java.util.*;

class Node {
    int val;
    Node left, right;

    Node(int data) {
        this.val = data;
    }

    Node(int data, Node left, Node right) {
        this.val = data;
        this.left = left;
        this.right = right;
    }
}

class BST {
    Node root;

    Node insertBST(Node root, int val) {
        if (root == null) {
            return new Node(val);
        }

        if (val < root.val) {
            root.left = insertBST(root.left, val);
        } else if (val > root.val) {
            root.right = insertBST(root.right, val);
        }

        return root;
    }

    Node searchBST(Node root, int data) {
        while (root != null && root.val != data) {
            if (data < root.val) {
                root = root.left;
            } else {
                root = root.right;
            }
        }
        return root;
    }

    void inorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }

    void preorder(Node root) {
        if (root == null)
            return;

        System.out.print(root.val + " ");
        inorder(root.left);

        inorder(root.right);
    }

    void postorder(Node root) {
        if (root == null)
            return;

        inorder(root.left);

        inorder(root.right);
        System.out.print(root.val + " ");
    }

    void levelorder(Node root) {
        System.out.println();
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while (!q.isEmpty()) {
            Node cur = q.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null)
                q.offer(cur.left);
            if (cur.right != null)
                q.offer(cur.right);

        }

    }

    Node del(Node root, int key) {
        if (root == null) {
            return root;
        }
        if (key < root.val) {
            root.left = del(root.left, key);
        } else if (key > root.val) {
            root.right = del(root.right, key);
        } else {
            if (root.left == null) {
                return root.right;
            }
            if (root.right == null) {
                return root.left;
            }
            Node min = findMin(root.right);
            root.val = min.val;
            root.right = del(root.right, min.val);
        }
        return root;
    }

    Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }
}

public class FULLBST {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        BST b = new BST();

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            b.root = b.insertBST(b.root, val);
        }

        int key = sc.nextInt();

        Node res = b.searchBST(b.root, key);

        if (res != null) {
            System.out.println("Found: " + res.val);
        } else {
            System.out.println("Not Found");
        }
        b.inorder(b.root);
        System.out.println();
        b.preorder(b.root);
        System.out.println();
        b.postorder(b.root);
        b.levelorder(b.root);
    }
}