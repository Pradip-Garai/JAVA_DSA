import java.util.Scanner;

class Node{
    public int data;
    public Node left;
    public Node right;

    public Node(int value){
        data=value;
        left=null;
        right=null;
    }
}
 

public class PostOrderTraversal {
    public Node Binary_Tree(){
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();

        // check -1
        if(data == -1)
            return null;

        Node temp = new Node(data);

        System.out.print("Enter Left Child of "+temp.data+": ");
        temp.left = Binary_Tree();

        System.out.print("Enter Right Child of "+temp.data+": ");
        temp.right = Binary_Tree();

        return temp;
    }
    
    public void traversal(Node root){
        if(root == null)
          return;

        traversal(root.left);
        traversal(root.right);
        System.out.print(root.data+" ");

    }
    public static void main(String[] args) {
        PostOrderTraversal pt = new PostOrderTraversal();
        System.out.print("Enter Root Node : ");
        Node root = pt.Binary_Tree();
        
        // postorder Traversal 
        pt.traversal(root);
    }
}
