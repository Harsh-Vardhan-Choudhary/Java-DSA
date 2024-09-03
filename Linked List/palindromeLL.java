import java.util.Stack;

public class palindromeLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
   }

    public boolean isPalindromeApproach1(ListNode head) {
        Stack<Integer> st = new Stack<>();
        ListNode traverse = head;
        ListNode comparison = head;

        //adding element to stack
        while(traverse != null) {
            st.push(traverse.val);
            traverse = traverse.next;
        }     

        //stack is LIFO, comparing stack element with LL element
        while(comparison != null && !st.isEmpty()){
            if(comparison.val != st.peek()) {
                return false;
            }
            else {
                comparison = comparison.next;
                st.pop();
            }
        }

        return true;
    }

    public ListNode reverseList(ListNode head) {
        ListNode temp = null;
        while(head!=null) {
            ListNode next = head.next;
            head.next = temp;
            temp = head;
            head = next;
        }
        return temp;
    }

    public boolean isPalindromeApproach2(ListNode head) {
        
        if(head == null || head.next == null) {
            return true;
        }
        
        //first step find middle
        ListNode fast = head;
        ListNode slow = head;

        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode newHead = reverseList(slow.next);

        //divide the ll in 2 halfs
        ListNode first = head;
        ListNode second = newHead;

        //compare the elemet of first ll to second ll
        while(second != null) {
            if(first.val != second.val) {
                reverseList(newHead);
                return false;
            }
            else {
                first = first.next;
                second = second.next;
            }
        }

        reverseList(newHead);
        return true;
    }
}