package bishi;

import java.util.Scanner;
//去除多余下划线__aa__cc__aa___
public class xunfei_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str=scanner.nextLine();
//        System.out.println(str);

        if (str.length()<1)
            System.out.println("");
        char[] s=str.toCharArray();
        int front=0;
        for (int i=0;i<str.length();i++){
            if (s[i]=='_'){
                front++;
            }
            else break;
        }
        int end=0;
        for (int i=s.length-1;i>=0;i--){
            if (s[i]=='_'){
                end++;
            }
            else break;
        }
        String ans=str.substring(front,s.length-end);
//        System.out.println(ans);
        StringBuffer res=new StringBuffer();
        res.append(ans.charAt(0));
        for (int i=1;i<ans.length();i++){
            if (ans.charAt(i)=='_'&&ans.charAt(i-1)=='_')
                continue;
            else res.append(ans.charAt(i));
        }
        System.out.println(res);
    }
}
