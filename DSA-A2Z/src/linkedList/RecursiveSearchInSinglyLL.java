package linkedList;

public class RecursiveSearchInSinglyLL {
    static void main() {
        Node head=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(3);
        Node node4=new Node(4);
        head.next=node2;
        node2.next=node3;
        node3.next=node4;
        System.out.println(recursiveSearch(head,3));
        System.out.println(recursiveSearch(head,5));
    }

    static boolean recursiveSearch(Node head, int x)
    {
        if(head==null)
            return false;
        if(head.num==x)
        {
            return true;
        }
        return recursiveSearch(head.next,x);
    }
}
