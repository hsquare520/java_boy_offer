package bishi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tencent_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        ListNode head1=null;
        ListNode temp1=null;
        for (int i=0;i<n;i++){
            if (i==0){
                head1=new ListNode(scanner.nextInt());
                temp1=head1;
                continue;
            }
            ListNode newNode=new ListNode(scanner.nextInt());
            temp1.setNext(newNode);
            temp1=temp1.next;
        }
        int m=scanner.nextInt();
        ListNode head2=null;
        ListNode temp2=null;
        for (int i=0;i<m;i++){
            if (i==0){
                head2=new ListNode(scanner.nextInt());
                temp2=head2;
                continue;
            }
            ListNode newNode=new ListNode(scanner.nextInt());
            temp2.setNext(newNode);
            temp2=temp2.next;
        }
        while (head1 != null && head2 != null) {
            if (head1.val>head2.val){
                head1=head1.next;
            }
            else if (head1.val<head2.val){
                head2=head2.next;
            }
            else {
                System.out.print(head1.val + " ");
                head1=head1.next;
                head2=head2.next;
            }
        }
    }
}
class ListNode{
    int val;
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
