class Node{
    public int val;
    public int ht;
    Node left ,right;
    Node(int val){
        this.val = val;
        ht=1;
        this.left = null;
        this.right = null;
    }
}

class AVL{
    Node insert(Node root,int val){
        if(root == null){
            return new Node(val);
        }
        else if(root.val>val){
            root.left = insert(node.left,val);
        }
        else if(root.val<val){
            root.right = insert(node.right,val);
        }
        else
        return root;
        
        int ht = getheight(root);
        int bal = getheight(root.left-root.right);
    }
}

public class Main{
    public static void main(String args[]){
        AVL t = new AVL();
        Node root = null;
        int[] values ={20,30,25,47,67,90,33,89};
        for(int i:values){
            root = insert(root,i);
        }
        t.inorder(root);
        t.preorder(root);
        t.postorder(root);
        
    }
}
