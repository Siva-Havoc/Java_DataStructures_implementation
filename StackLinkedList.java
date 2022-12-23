/*
 * Aurthor Siva M
 */

// Stack Implementaion using Linked List
public class StackLinkedList {
  
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
// Method to push the lement into stack
    public void push(int x)
    {
        Node nn=new Node(x);
        if(head == null)
        {
            head=nn;
        }
        else
        {
            nn.next=head;
            head=nn;
        }
    }
// Method to pop the element out of the stack
    public int pop()
    {   
        int a=0;
        if(head == null)
        {
            System.out.println("Stack is Empty");
        }
        else
        {   
            a=head.data;
            head=head.next;
        }
        return a;
    }
// To Display the elements in the stack;
    public void display()
    {
        Node t=head;
        while(t !=null)
        {
            System.out.print(t.data +" ");
            t=t.next;
        }
        System.out.println("");
    }
    public static void main(String [] args)
    {   
        // use scanner to get input
        // Whenever a new Object is created a new stack is created
        StackLinkedList obj=new StackLinkedList();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.display();
        obj.pop();
        obj.display();
    }
}
