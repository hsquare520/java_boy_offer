package offer;

import java.util.Stack;

public class offer_9_CQueue {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public offer_9_CQueue() {
        stack1=new Stack<>();
        stack2=new Stack<>();
    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack1.isEmpty())
            return -1;
        while (!stack1.isEmpty())
            stack2.push(stack1.pop());
        int value=stack2.pop();
        while (!stack2.isEmpty())
            stack1.push(stack2.pop());
        return value;
    }

    public static void main(String[] args) {
        offer_9_CQueue obj=new offer_9_CQueue();
        obj.appendTail(1);
        obj.appendTail(2);
        int a=obj.deleteHead();
        System.out.println(a);
    }
}
