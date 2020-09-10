package offer;

public class offer_18_deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode temp=head;
        if (head.val==val)
            return head.next;
        while (head!=null&&head.next!=null){
            if (head.next.val==val)
                head.next=head.next.next;
            else head=head.next;
        }
        return temp;
    }
}
