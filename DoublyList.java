  /*
 * Aurthor Siva M
 */
  class DoublyList
    {
    class Node
    {
        int data;
        Node next;
        Node prev;
        Node(int x)
        {
            this.data=x;
            this.next=null;
            this.prev=null;
        }
    }
    Node head;

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
        nn.prev=t;
    }

    public void deleteEnd()
    {
        Node t=head;
        Node pptr=t;
        while(t.next !=null)
        {   
            pptr=t;
            t=t.next;
           
        }
        pptr.next=null;

    }

    public void display()
    {   Node t=head;
        while(t!=null)
        {
            System.out.print(t.data+" ");
            t=t.next;
        }
        System.out.println("");
    }

    public void insertAt(int pos, int x)
    {
        Node nn = new Node(x);
        Node t=head;
        for(int i=2 ;i<pos ;i++)
        {
            t=t.next;
        }
        nn.next=t.next;
        nn.prev=t;
        t.next.prev=nn;
        t.next=nn;
        
    }
    
    public void deleteAt(int pos)
    {
        Node t=head;
        Node n=t.next;
        for(int i=2;i<pos;i++)
        {
            t=t.next;
            n=n.next;
        }
        if(n.next ==null)
        {
            deleteEnd();
            return;
        }
        t.next=n.next;
        n.next.prev=t;
    }

    public void deleteStart()
    {
        head=head.next;
        head.prev=null;

    }
    public static void main(String []args)
    {
        DoublyList obj=new DoublyList();
        obj.insert(1);
        obj.insert(2);
        obj.insert(4);
        obj.insertAt(3,3);
        obj.display();
        obj.deleteStart();
        obj.display();

    }
    }

    