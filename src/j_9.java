public class j_9 {
    public static void main(String[] args) {
/*
https://leetcode-cn.com/problems/intersection-of-two-linked-lists/
 */

    }

    public ListNode get_intersection_node(ListNode l1, ListNode l2) {
        if (l1 == null || l2 == null)
            return null;
        ListNode p1 = l1, p2 = l2;
        while (p1 != p2) {
            if (p1 != null)
                p1 = p1.next;
            else p1 = l2;
            if (p2 != null)
                p2 = p2.next;
            else p2 = l1;
        }
        return p1;
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}
