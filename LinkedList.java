/*
 * Aurthor Siva M
 */
import java.util.Scanner;

class LinkedList
{   
    /*Inner class to create a Node */
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

    /*Method Used to Insert the element at the End */

    public void insert(int x)
    {
        Node nn=new Node(x);
        if(head == null)
        {
            head=nn;
            return;
        }
        Node t=head;
        while(t.next != null)
        {
            t=t.next;
        }
        t.next=nn;
    }
    
    /*Insert the element at the given position */

    public void insertAt(int pos ,int x)
    {
        if (head == null)
        {
            insert(x);
            return;
        }
        Node nn=new Node(x);
        Node t=head;
        Node p=head;
        for(int i=1;i<pos;i++) // iterate pos-2 times
        {   
            p=t;
            t=t.next;
            if(t.next == null)
            {
                t.next=nn;
                return;
            }
        }
        p.next=nn;
        nn.next=t;
    }
    
    /* Method to delete the Last Node */

    public void delete()
    {
        Node t=head;
        Node prev=t;
        while(t.next !=null)
        {   
            prev=t;
            t=t.next;
           
        }
        prev.next=null;

    }

    /* Method to Display the elements in the LinkedList */

    public void display()
    {   Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println("");
    }

    /*Method to reverse the Linked List */

    public void reverse()
        {
            Node prev=null;
            Node curr=head;
            Node next=null;

            while(curr != null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
        }
    
        /*Main Method */
    public static void main(String []args)
    {
        LinkedList obj=new LinkedList();
        Scanner scan=new Scanner(System.in);
        while(true)
        {
            int a=scan.nextInt();
            if(a<0)
            break;
            obj.insert(a);
        }
        scan.close();
        obj.display();
    

    }
}