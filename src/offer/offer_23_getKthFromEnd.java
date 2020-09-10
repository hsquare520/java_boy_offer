package offer;

public class offer_23_getKthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode tmp = null;
        tmp = head;
        int len = 0;
        while (tmp != null) {
            len++;
            tmp = tmp.next;
        }
        int count = len - k;
        for (int i = 0; i < count; i++) {
            head = head.next;
        }
        return head;
    }
}
