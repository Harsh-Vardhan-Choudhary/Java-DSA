public class RemoveNthNodeBackOfLL {
    //Definition for singly-linked list
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Create a dummy node that points to the head of the list
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode first = dummy;
        ListNode second = dummy;

        // Advance first pointer by n+1 steps 
        // so that the gap between first and second is n
        for (int i = 0; i <= n; i++) {
            first = first.next;
        }
        
        // Move first to the end, maintaining the gap
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        
        // Skip the desired node
        second.next = second.next.next;
        
        // Return the new head, which is next of the dummy node
        return dummy.next;
    }
}
