/*
 * Aurthor Siva M
 */
import java.util.Scanner;

// Array Implementaion odf Stack
class StackArray
{
    int arr[];
    int top;
    // Constructor for Stack Class
    StackArray(int size)
    {
        arr=new int[size];
        top=-1;
    }
// Method to push the element into the Stack
    public void push(int x)
    {
        arr[++top]=x;
    }
// Method to pop the Element out of the Stack
    public int pop()
    {
        int ans=arr[top];
        top--;
        return ans;
    }

    public static void main(String [] args)
    {
        StackArray obj=new StackArray(20);
       Scanner scan=new Scanner(System.in);
       while(true){
        int a=scan.nextInt();
        
        if(a<0)
        break;
        obj.push(a);
       }
       scan.close();
       while(obj.top>=0)
       {
        System.out.print(obj.pop()+" ");
       }
        
    }
}