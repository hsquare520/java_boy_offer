package offer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class offer_6_reversePrint {
    public int[] reversePrint(ListNode head){
        Stack<Integer> stack=new Stack<>();
        while (head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int len=stack.size();
        int[] res=new int[len];
        for (int i=0;i<len;i++)
            res[i]=stack.pop();
        return res;
    }
}
class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}