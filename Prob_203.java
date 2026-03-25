class Prob_203 {
    public static class ListNode {
        int val;
        ListNode next;
    }
    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val){
            head = head.next;
        }

        ListNode temp = head;
        ListNode prev = null;

        while(temp != null){
            if(temp.val == val){
                prev.next = temp.next;
            }
            else{
                prev = temp;
            }
            temp = temp.next;
        }
        return head;
    }
    static void main(){

    }
}