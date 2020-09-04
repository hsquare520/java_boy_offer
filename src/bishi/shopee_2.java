package bishi;

import java.util.Stack;

public class shopee_2 {
    /**
     * 计算t的最小长度
     *
     * @param str string字符串 输入的字符串
     * @return int整型
     */
    public int getMinLen(String str) {
        // write code here
        char[] s=str.toCharArray();
        int count=0;
        Stack<Character> stack=new Stack<>();
        for (int i=0;i<s.length;i++){
            if (!stack.contains(s[i])){
                stack.push(s[i]);
                count++;
            }

            else stack.pop();
        }
        return count-stack.size();
    }
    public int getMinLen1(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if (str.substring(0,i)==str.substring(i,2*i)){
                count=i;
            }
        }
        int ans=str.length()%count;
        int res=count-ans;
        return res;
    }
}
