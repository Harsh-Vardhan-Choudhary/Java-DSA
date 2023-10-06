//package Linked List;

public class LinkedList
{
    public static class Node
    {
        int data;
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data)
    {
        //step1 = create new node
        Node newNode = new Node(data);
        size++;

        //if 0 node in a linked list
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        //step2 - newNode next -> head
        newNode.next = head;

        //step3 - head = newNode
        head = newNode;
    }

    public void addLast(int data)
    {
        //step1 - create new node
        Node newNode = new Node(data);
        size++;

        //if 0 node in linked list
        if(head == null)
        {
            head = tail = newNode;
            return;
        }

        //step2 - tail next -> newNode
        tail.next = newNode;

        //step3 - tail = newNode
        tail = newNode;
    }

    public void print()     //O(n)
    {
        //if 0 node in linked list
        if(head == null)
        {
            System.out.println("Linked List is empty");
            return;
        }

        //initialising a node temp to traverse in LL
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data + "\t -> \t");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void add(int indx, int data)
    {
        if(indx == 0)
        {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        int i = 0;
        Node temp = head;

        while(i<=indx-1)
        {
            temp = temp.next;
            i++;
        }

        // i=indx-1 | temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst()
    {
        if(size == 0)
        {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast()
    {
        if(size==0)
        {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        else if(size == 1)
        {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size-2
        Node temp = head;
        int i=0;

        for(i=0; i<=size-2; i++)
        {
            temp = temp.next;
        }

        int val = temp.next.data;       //tail.data
        temp.next = null;
        tail = temp;
        size--;

        return val;
    }

    public int itrSearch(int key)       //O(n)
    {
        Node temp = head;
        int i=0; 

        while(temp.next != null)
        {
            if(temp.data == key)
            {
                System.out.println("Key found at index : " + i);
                return i;
            }

            else
            {
                temp = temp.next;
            }
        }

        //key not found
        return -1;
    }

    public int helper(Node head, int key)
    {
        if(head == null)
        {
            return -1;
        }

        else if(head.data == key)
        {
            return 0;
        }

        int indx = helper(head.next, key);
        if(indx == -1)
        {
            return -1;
        }

        return indx+1;
    }

    public int RecSearch(int key)
    {
        return helper(head,key);
    }

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        System.out.println(ll.size);
    }


}
