class Node{
    char val;
    Node left;
    Node right;
    public Node(char val){
        this.val = val;
        this.left =null;
        this.right =null;
    }
}


public class DFS{

    static void preOrderTransversal(Node root){
    if(root==null) return;
    System.out.print(root.val+ " ");
    preOrderTransversal(root.left);
    preOrderTransversal(root.right);
}
   
    static void inOrderTransversal(Node root){
        if(root==null)return;
        inOrderTransversal(root.left);
        System.out.print(root.val+" ");
        inOrderTransversal(root.right);
    }

    static void postOrderTransversal(Node root){
        if(root==null)return;
        postOrderTransversal(root.left);
        postOrderTransversal(root.right);
        System.out.print(root.val+" ");
    }
    public static void main(String[] args){
        // 0 Level
        Node root=new Node('A');

        // 1 Level
        root.left=new Node('B');
        root.right=new Node('C');

        // 2 Level
        root.left.left=new Node('D');
        root.left.right=new Node('E');
        root.right.left=new Node('G');
        root.right.right=new Node('H');

        // 3 Level
        root.left.right.left=new Node('I');
        root.left.right.right=new Node('J');
        root.right.left.left=new Node('K');

        preOrderTransversal(root);
        System.out.println();
        inOrderTransversal(root);
        System.out.println();
        postOrderTransversal(root);
    }
}

       
    
