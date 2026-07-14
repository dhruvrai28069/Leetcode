import java.util.*;

public class Prob_82 {

    public static class ListNode {
        int val;
        Prob_82.ListNode next;
        public ListNode(int i, ListNode head){}
    }

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(0, head);

        ListNode prev = dummy;

        while (head != null) {
            if (head.next != null && head.val == head.next.val) {

                while (head.next != null && head.val == head.next.val) {
                    head = head.next;
                }

                prev.next = head.next;
            } else {
                prev = prev.next;
            }
            head = head.next;
        }

        return dummy.next;
    }
}
