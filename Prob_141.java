public class Prob_141 {

    public static class ListNode {
        int val;
        Prob_141.ListNode next;
    }
    public boolean hasCycle(ListNode head) {

        if(head == null){
            return false;
        }

        ListNode slow = head;
        ListNode fast = head.next;

        while(slow != fast){

            if(fast == null || fast.next == null){
                return false;
            }

            slow = slow.next;
            fast = fast.next.next;
        }
        return true;

    }
}