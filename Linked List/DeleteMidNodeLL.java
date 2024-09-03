public class DeleteMidNodeLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode deleteMiddle(ListNode head) {

        if (head == null || head.next == null) {
            return null; // List is empty or has only one node
        }
        
        //find middle node
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next.next != null && fast.next.next.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //skipping the mid value
        slow.next = slow.next.next;

        return head;
    }
}