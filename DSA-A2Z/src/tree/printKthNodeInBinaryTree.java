package tree;

public class printKthNodeInBinaryTree {
    static void main() {
        Node n1=new Node(10);
        n1.left=new Node(20);
        n1.right=new Node(30);
        n1.right.left= new Node(40);
        n1.right.right=new Node(50);
        System.out.println("printing node at height 2");
        printKthNode(n1,0,2);
        System.out.println("printing node at height 1");
        printKthNode(n1,0,1);
    }

    static void printKthNode(Node node, int height, int k)
    {
        if(node==null)
            return;
        if(height==k)
        {
            System.out.println(node.key);
        }
        printKthNode(node.left,height+1,k);
        printKthNode(node.right,height+1,k);
    }

}
