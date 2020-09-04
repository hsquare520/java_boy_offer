package bishi;

import java.util.Stack;

public class shopee_1 {
    public int getMinScore (int[] gz) {
        // write code here
        Stack<Integer> stack1=new Stack<>();
        Stack<Integer> stack2=new Stack<>();
        int coungt=0;
        for (int i=0;i<gz.length;i++){
            if (i%2==0){
                stack2.push(gz[i]);
            }
            else stack1.push(gz[i]);
        }
        while (!stack1.isEmpty()&&!stack2.isEmpty()){
            int temp1=stack1.pop();
            int temp2=stack2.pop();
            coungt=temp1+temp2;
        }
        return coungt;
    }
}
