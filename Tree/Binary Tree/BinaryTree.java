import java.util.LinkedList;
import java.util.Queue;
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

public class BinaryTree{
    public static void main(String[] args) {
        Queue<Node>q = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Root Data : ");
        int x = sc.nextInt();
        Node root = new Node(x);
        q.add(root);
            
        while(! q.isEmpty()){
            Node temp = q.peek();
            q.remove();

            //left child input
            System.out.print("Enter Left Child of "+temp.data+": ");
            int data = sc.nextInt();
            if(data!=-1){
                temp.left = new Node(data);
                q.add(temp.left);
            }

            //Right child input
            System.out.print("Enter Right Child of "+temp.data+": ");
            data = sc.nextInt();
            if(data!=-1){
                temp.right = new Node(data);
                q.add(temp.right);
            }
        }

        sc.close();
    }
}