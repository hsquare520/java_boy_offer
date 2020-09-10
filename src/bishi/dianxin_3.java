package bishi;

import java.util.Scanner;

public class dianxin_3 {
    public static int max_count(int[] num,int n){
        if (n==0)
            return num[0];
        else if (n==1)
            return Math.max(num[0],num[1]);
        else {
            int aa=max_count(num,n-2)+num[n];
            int bb=max_count(num,n-1);
            return Math.max(aa,bb);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings=scanner.nextLine().split(",");
        int[] num=new int[strings.length];
        for (int i=0;i<strings.length;i++){
            num[i]=Integer.parseInt(strings[i]);
        }
        System.out.println(max_count(num,num.length-1));
    }
}
