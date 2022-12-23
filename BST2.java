/*
 * aurthor : Siva M
 */
import java.util.Scanner;

public class BST2 {

    /*To create a Tree node */

    class Node
    {
        int data;
        Node left;
        Node right;
    /* Constructor for creating a tree Node */ 
        Node(int x)
        {
            this.data=x;
            this.left=null;
            this.right=null;
        }
    }
    Node root;  //Reference for the root

    /*
        * Aurthor Siva M
    */
    
    /*Method for Insertion */

    public void insert(int x)
    {
        root=insertR(root,x);
    }

    /*Recursive method for Insertion */

    public Node insertR(Node root2, int x)
    {
        if(root2 == null)
            return root2=new Node(x);
        else if(x < root2.data)
            root2.left=insertR(root2.left, x);
        else if(x > root2.data)
            root2.right=insertR(root2.right,x);
        
        return root2;
    }

    /*Inorder Traversal */

    public void Inorder()
    {
        root=InorderR(root);
        System.out.println();
    }

    /*Recursive method for Inorder Traversal */

    public Node InorderR(Node root2)
    {   
        if(root2 == null)
        {
            return root2;
        }
        InorderR(root2.left);
        System.out.print(root2.data+" ");
        InorderR(root2.right);

        return root2;
    }

    /*Preorder Traversal */

    public void PreOrder()
    {
        root=PreOrderR(root);
        System.out.println();
    }

    /*Recursive Method for PreOrder Traversal */

    public Node PreOrderR(Node root2)
    {   
        if(root2 == null)
        {
            return root2;
        }
        System.out.print(root2.data+" ");
        PreOrderR(root2.left);
        PreOrderR(root2.right);

        return root2;
    }

    /*Postorder Traversal */

    public void PostOrder()
    {
        root=PostOrderR(root);
        System.out.println();
    }

    /*Recursive Method for PostOrder Traversal */

    public Node PostOrderR(Node root2)
    {
        if(root2 == null)
        {
            return root2;
        }
        PostOrderR(root2.left);
        PostOrderR(root2.right);
        System.out.print(root2.data+" ");

        return root2;
    }   

    /*Method to search */

    public boolean search(int x)
    {
        root=searchR(root,x);
        if(root == null)
        return false;
        if(root.data==x)
        return true;
        return false;
        
    }

    /*Recursive method to Search */

    public Node searchR(Node root2,int x)
    {   
        if(root2 == null || root2.data==x)
        {
            return root2;
        }
        else if(x < root2.data)
            return root2.left=searchR(root2.left, x);
        else if(x > root2.data)
            return root2.right=searchR(root2.right, x);

        return root2;
    }

    /*Method to delete */

    public void delete(int x)
    {   

        root=deleteR(root, x);
        
    }

    /*Recursive Method to delete */

    public Node deleteR(Node root2 , int x)
    {   
        if(root2==null )
        return root2;
        
        if(x<root2.data)
        root2.left=deleteR(root2.left,x);
        else if(x > root2.data)
        root2.right=deleteR(root2.right, x);
        else
        {
            if(root2.left ==null)
            return root2.right;
            else if(root2.right ==null)
            return root2.left;
            
              
            root2.data=findMin(root2.right);
            root.right=deleteR(root.right, root2.data);
            
        }

        return root2;
    }

    /*Find the Minimum value in the Right Sub Tree */

    public int findMin(Node root3)
    {   
        int min=root3.data;
        while (root3.left != null)
        {
            min=root3.left.data;
            root3=root3.left;
        }
        return min;
    }

    /*Main Method */
    public static void main(String [] args)
    {
        BST2 obj=new BST2();
        int a;
        Scanner scan=new Scanner(System.in);
        do{
             a=scan.nextInt();
             if(a<0)
             break;
            obj.insert(a);
        }
        while(a>0);
        scan.close();
        obj.Inorder();        
    }
}
