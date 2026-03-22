public class Prob_2130 {

    public static class ListNode {
        int val;
        Prob_2130.ListNode next;
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

    public int pairSum(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = reverseList(slow.next);

        int maxi = Integer.MIN_VALUE;
        while(second != null){
            maxi = Math.max(maxi,(first.val + second.val));
            first = first.next;
            second = second.next;
        }
        return maxi;
    }
}

