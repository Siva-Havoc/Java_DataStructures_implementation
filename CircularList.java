/*
 * Aurthor Siva M
 */
class CircularList
{
    class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            this.data=x;
            this.next=null;
        }

    }
    Node head;
    Node tail;

    public void insert(int x)
    {
        Node nn=new Node(x);
        if(head==null)
        {
            head=nn;
            tail=nn;
            return;
        }
        tail.next=nn;
        tail=nn;
        tail.next=head;
    }
    public void display()
    {   Node t=head;
        do
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
        while(t !=head);
    }

    public static void main(String []args)
    {
        CircularList obj=new CircularList();
        obj.insert(10);
        obj.insert(20);
        obj.display();

    }
}