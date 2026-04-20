package linkedList;

public class LLTraversalRecursion {
    static void main() {
        Node head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        System.out.println();
        recursiveTraverseLL(head);
    }

    private static void recursiveTraverseLL(Node head)
    {
        if(head==null)
            return;
        System.out.print(head.num+" ");
        recursiveTraverseLL(head.next);
    }
}

