public class Prob_234 {

    public static class ListNode {
        int val;
        Prob_234.ListNode next;
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

    public boolean isPalindrome(ListNode head) {

        if(head == null || head.next == null) return true;

        ListNode slow = head;
        ListNode fast = head;

        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode first = head;
        ListNode second = reverseList(slow.next);

        while(second != null){
            if(second.val != first.val){
                reverseList(second);
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverseList(second);
        return true;
    }
}