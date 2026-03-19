public class Prob_206 {

    public static class ListNode {
        int val;
        ListNode next;
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
    static void main(){

    }
}