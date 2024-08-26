class Node{
    int data;
    Node next;
    public Node(int data)
    {
        this.data=data;
        this.next=null;

    }
}
public class FindMiddleElementll {
    public static int getMiddleNode(Node head)
    {
        Node slow,fast;
        slow=fast=head;
        while(fast!=null && fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        return slow.data;
    }
    public static void main (String args[])
    {
        Node head = new Node(10);
        head.next =new Node(20);
        head.next.next=new Node(30);
        head.next.next.next=new Node(40);
       // head.next.next.next.next = new Node(50);
        int result=getMiddleNode(head);
        System.out.println("middle node element is:"+result);

    }
}
