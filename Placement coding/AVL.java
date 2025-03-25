class Node {
    public int val;
    public int ht;
    Node left, right;

    Node(int val) {
        this.val = val;
        ht = 1;
        this.left = null;
        this.right = null;
    }
}

class AVL {

    int getheight(Node node) {
        return node == null ? 0 : node.ht;
    }

    int getbalance(Node node) {
        return node == null ? 0 : (getheight(node.left) - getheight(node.right));
    }

    Node right(Node y) {
        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.ht = Math.max(getheight(y.left), getheight(y.right)) + 1;
        x.ht = Math.max(getheight(x.left), getheight(x.right)) + 1;

        return x;
    }

    Node left(Node y) {
        Node x = y.right;
        Node T2 = x.left;

        x.left = y;
        y.right = T2;

        y.ht = Math.max(getheight(y.left), getheight(y.right)) + 1;
        x.ht = Math.max(getheight(x.left), getheight(x.right)) + 1;

        return x;
    }

    Node leftright(Node y) {
        y.left = left(y.left);
        return right(y);
    }

    Node rightleft(Node y) {
        y.right = right(y.right);
        return left(y);
    }

    void inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.val + " ");
            inorder(node.right);
        }
    }
    
    void preorder(Node node) {
        if (node != null) {
            System.out.print(node.val + " ");
            preorder(node.left);
            preorder(node.right);
        }
    }

    Node insert(Node node, int val) {
        if (node == null) {
            return new Node(val);
        } else if (node.val > val) {
            node.left = insert(node.left, val);
        } else if (node.val < val) {
            node.right = insert(node.right, val);
        } else {
            return node; 
        }

        node.ht = Math.max(getheight(node.left), getheight(node.right)) + 1;
        int bal = getbalance(node);

        if (bal > 1 && val < node.left.val) {
            return right(node);
        } else if (bal < -1 && val > node.right.val) {
            return left(node);
        } else if (bal > 1 && val > node.left.val) {
            return leftright(node);
        } else if (bal < -1 && val < node.right.val) {
            return rightleft(node);
        }

        return node;
    }
}

public class Main {
    public static void main(String args[]) {
        AVL t = new AVL();
        Node root = null;
        int[] values = {20, 30, 25, 47, 67, 90, 33, 89};
        for (int i : values) {
            root = t.insert(root, i);
        }
        t.inorder(root);
        System.out.println();
        t.preorder(root);
    }
}
