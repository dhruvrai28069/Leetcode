public class Prob_143 {

    public static class ListNode {
        int val;
        Prob_143.ListNode next;
    }

    public ListNode reverseList(ListNode head) {

        ListNode prev = null;
        ListNode temp = head;

        while(temp != null){
            ListNode forward = temp.next;
            temp.next = prev;
            prev = temp;
            temp = forward;
        }
        return prev;
    }

    public void reorderList(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = reverseList(slow.next);
        slow.next = null;

        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
        return;
    }
}