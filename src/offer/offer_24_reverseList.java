package offer;

import java.util.List;

public class offer_24_reverseList {
    public ListNode reverseList(ListNode head){
        ListNode next=null;
        ListNode cur=null;
        while (head!=null){
            next=head.next;
            head.next=cur;
            cur=head;
            head=next;
        }
        return cur;
    }
}
