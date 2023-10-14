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

    public int helper(Node head, int key)       //helper function - we can also use it directly
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

    public void reverse()       //O(n)
    {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev; 
            prev = curr; 
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n)
    {
        int sz = 0;
        Node temp = head;
        while(temp != null)
        {
            temp = temp.next;
            sz++;
        }

        if(n == sz)
        {
            head = head.next;   //removeFirst
            return;
        }

        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        if(i<iToFind)
        {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    //check whether the linked list is palindrome or not

    //slow fast method - we will used this method to find out the centre of the linked list
    public Node findMid(Node head)
    {
        Node slow = head;
        Node fast = head;

        while(fast!=null || fast.next!=null)
        {
            slow = slow.next;       //+1
            fast = fast.next.next;  //+2
        }

        return slow;        //it will return the mid node of LL
    }

    public boolean checkPalindrome()
    {
        //LL is empty or single element is present
        if(head == null || head.next==null)
        {
            return true;
        }

        //mid node
        Node MidNode = findMid(head);
        
        //reversing the right side LL
        Node prev = null;
        Node curr = MidNode;
        Node next;

        while(curr!=null)
        {
            next = curr.next;
            curr.next = prev; 
            prev = curr; 
            curr = next;
        }

        Node right = prev;
        Node left = head;

        //checking whether the left side is equal to right side
        while(right!=null)
        {
            if(right.data != left.data)
            {
                return false;
            }
            right = right.next;
            left = left.next;
        }
        return true;
    }

    //detecting loop within in linked list or not
    public static boolean detectLoop()
    {
        Node slow = head;
        Node fast = head;

        while(fast != null || fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast)
            {
                return false;
            }
        }
        return true;
    }

    //merge sort in a linked list

    public Node getMid(Node head)
    {
        Node slow = head; 
        Node fast = head.next;

        while(fast != null || fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    private Node merge(Node head1, Node head2)
    {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while(head1 != null && head2 != null)
        {
            if(head1.data <= head2.data)
            {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else
            {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while(head1 != null)
        {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while(head2 != null)
        {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergedLL.next;
    }

    public Node mergeSort(Node head)
    {
        if(head == null || head.next == null)
        {
            return head;
        }

        //Find mid
        Node mid = getMid(head);

        //left & right MS
        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft,newRight);
    }

    //Zig-Zag Linked List
    public void zigZag()
    {
        //find mid
        Node slow = head;
        Node fast = head.next;

        while(fast != null || fast.next != null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;

        //Reverse 2nd half
        Node curr = mid.next;
        mid.next = null;
        Node prev = null; 
        Node next;

        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextL, nextR;

        //alternative merge - zig zag pattern
        while(left != null && right != null)
        {
            nextL = left.next;
            left.next = right;
            nextR = right.next; 
            right.next = nextL;

            left = nextL;
            right = nextR;
        }
    }

    public static void main(String args[])
    {
        LinkedList ll = new LinkedList();
        System.out.println(ll.size);
    }
}
