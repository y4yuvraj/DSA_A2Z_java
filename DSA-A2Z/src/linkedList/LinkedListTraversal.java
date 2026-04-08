package linkedList;

public class LinkedListTraversal {
    public static void main(String[] args) {
        Node head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        traverseLL(head);
    }

    public static void traverseLL(Node head)
    {
        while(head != null)
        {
            System.out.print(head.num+" ");
            head=head.next;
        }
    }
}
class Node
{
    int num;
    Node next;
    Node(int num)
    {
        this.num=num;
        this.next=null;
    }
}
