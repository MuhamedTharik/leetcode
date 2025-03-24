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
    
    int getheight(Node node){
        return node==null? 0:node.ht;
    }
    
    int getbalance(Node node){
        return node==null? 0:(getheight(node.left) - getheight(node.right));
    }
    
    Node left(Node y){
        Node x = y.left;
        x.right = y;
        return x;
    }
        
    Node right(Node y){
        Node x = y.right;
        x.left = y;
        return x;
    }
    
    Node leftright(Node y){
        y.left = left(y.left);
        return right(y);
    }
    Node rightleft(Node y){
        y.right = right(y.right);
        return left(y);
    }
    void inorder(Node node){
        if(node != null){
        inorder(node.left);
        System.out.print(node.val+" ");
        inorder(node.right);
    }

    }
    
    
    Node insert(Node node,int val){
        if(node == null){
            return new Node(val);
        }
        else if(node.val>val){
            node.left = insert(node.left,val);
        }
        else if(node.val<val){
            node.right = insert(node.right,val);
        }
        else
        return node;
        
        node.ht = Math.max(getheight(node.left),getheight(node.right))+1;
        int bal = getbalance(node);
        
        if(bal > 1 && val<node.left.val)
        Node x = right(Node y);
        else if( bal <-1 && val>node.right.val)
        Node x = left(Node y);
        else if(bal<-1 && val<node.right.val)
        Node x = leftright(Node y);
        else if(bal >1 && val>node.left.val)
        Node x = rightleft(Node y);
        return node;
    }
}

public class Main{
    public static void main(String args[]){
        AVL t = new AVL();
        Node root = null;
        int[] values ={20,30,25,47,67,90,33,89};
        for(int i:values){
            root = t.insert(root,i);
        }
        t.inorder(root);
        // t.preorder(root);
        // t.postorder(root);
        
    }
}
