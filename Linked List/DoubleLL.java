public class DoubleLL
{
    public class Node
    {
        int data;
        Node prev; 
        Node next;

        public Node(int data)
        {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public static void main(String [] args)
    {
        DoubleLL dll = new DoubleLL();
    }
}
