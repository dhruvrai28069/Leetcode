public class Prob_2095 {

    public static class ListNode {
        int val;
        Prob_2095.ListNode next;
    }
    public ListNode deleteMiddle(ListNode head) {

        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;

        }
        prev.next = prev.next.next;
        return head;
    }
}