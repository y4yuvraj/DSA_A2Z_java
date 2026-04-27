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
        System.out.println("printing size of the binary tree");
        System.out.println(printSize(n1));
    }

    static int printSize(Node node)
    {
        if(node==null)
            return 0;
        return 1+printSize(node.left)+printSize(node.right);
    }

    static void printKthNode(Node node, int height, int k)
    {
        if(node==null)
            return;
        if(height==k)
        {
            System.out.println(node.key);
            return;
        }
        printKthNode(node.left,height+1,k);
        printKthNode(node.right,height+1,k);
    }

}
