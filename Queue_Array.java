/**
 * 
 * Author : Siva M
 * 
 * Array Implementation of Queue
 */

import java.util.Scanner;
public class Queue_Array {
    int arr[];
    int front , rear , size;

    // Constructor ofr Queue_Array

    Queue_Array(int size)
    {
        arr= new int[size];
        front = 0;
        rear = 0;
        this.size = size;
    }

    // Method to Enqueue

    public void enqueue(int x)
    {
        if(rear == size)
        {
            System.out.println("Queue is Full !");
        }
        else
        {
            arr[rear]= x;
            rear ++;
        }
    }

    // Method to Dequeue

    public void dequeue()
    {
        if(front == rear)
        {
            System.out.println("Queue is empty !");
        }
        else
        {
            for( int i =0 ;i< rear ;i++)
            {
                arr[i] = arr[i+1];
            }
            arr[rear] = 0;
            rear --;
        }
    }

    // Method t display the elements in the Queue

    public void Display()
    {
        if(rear == front)
        {
            System.out.println("Queue is Empty !");
        }
        else
        {
            for(int i=0 ; i < rear ;i++)
            {
                System.out.print(arr[i] + " <-- ");
            }
            System.out.println("");
        }
    }

    public static void main(String [] args)
    {
        Queue_Array obj = new Queue_Array(20);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the elements to Enqueue :");
        while(obj.rear < obj.size && true)
        {
            int x = scan.nextInt();
            obj.enqueue(x);  
        }
        scan.close();
        obj.Display();
        

    }
}
