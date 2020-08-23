package offer;

import java.util.Stack;

public class reversePrint {
    public int[] reversePrint(ListNode head) {
        int len = 0;
        Stack<Integer> stack = new Stack<>();
        while (head != null) {
            stack.push(head.val);
            head = head.next;
            len++;
        }
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = stack.pop();
        }
        return arr;
    }
}

class ListNode {
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}