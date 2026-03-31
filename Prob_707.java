public class Prob_707{

    public static class ListNode {
        int val;
        Prob_707.ListNode next;
        ListNode(int x){
            val = x;
        }
    }

    ListNode head;
    int size;

    public Prob_707() {
        head = new ListNode(0);
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size) return -1;

        ListNode curr = head;
        for (int i = 0; i <= index; i++) {
            curr = curr.next;
        }
        return curr.val;
    }

    public void addAtHead(int val) {
        addAtIndex(0, val);
    }

    public void addAtTail(int val) {
        addAtIndex(size, val);
    }

    public void addAtIndex(int index, int val) {
        if (index > size) return;
        if (index < 0) index = 0;

        size++;
        ListNode curr = head;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        ListNode dummy = new ListNode(val);
        dummy.next = curr.next;
        curr.next = dummy;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;

        size--;
        ListNode curr = head;

        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        curr.next = curr.next.next;
    }
}