/**
 * 
 * Author Siva M
 * 
 * Linked List implementation of Queue
 * 
 */

 import java.util.Scanner;
public class Queue_LinkedList {


    // Inner class to create  a Node

    class Node{
        int data;
        Node next;
        Node(int x)
        {
            this.data =x ;
            this.next =null;
        }
    }
    Node front , rear;

    // Method to enqueue

    public void enqueue(int x)
    {   
        Node nn = new Node(x);
        if(rear == null)
        {
            front = rear = nn;
        }
        else
        {
            rear.next =nn;
            rear = nn;
        }
    }

    // Method to Dequeue

    public void dequeue()
    {
        if(rear == null)
        return;

        front=front.next;

        if(this.front == null)
        this.rear =null;
    }

    // Method to Display the elements inthe queue

    public void Display()
    {   
        Node temp = front;
        while(temp != null )
        {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public static void main(String [] args)
    {
        Queue_LinkedList obj = new Queue_LinkedList();
        Scanner scan = new Scanner(System.in);
        while(true)
        {
            int x = scan.nextInt();
            if(x <= 0 )
            break;
            obj.enqueue(x);   
        }
        obj.Display();
        scan.close();
        
    }
}
