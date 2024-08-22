import java.util.HashMap;

public class LLCycle {
    
    //Definition for singly-linked list
    class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycleBruteForce(ListNode head) {

        if(head == null) {
            return false;
        }

        HashMap<ListNode, Boolean> temp = new HashMap<>();

        while(head.next != null) {
            if(temp.containsKey(head)) {
                return true;
            }
            else {
                temp.put(head, true);
                head = head.next;
            }
        }

        return false;
    }

    public boolean hasCycleOptimal(ListNode head) {

        if(head == null) {
            return false;
        }

        ListNode fast = head;
        ListNode slow = head;

        while(fast!=null && fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast==slow) {
                return true;
            }
        }

        return false;
    }
}