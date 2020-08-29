package bishi;

import java.util.Scanner;
//求一个数的质数乘积
//50=2*3*3*5
public class xunfei_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        StringBuffer ans=new StringBuffer();
        for (int i=2;i<=n;i++){
            while (n%i==0){
                ans.append(i);
                n/=i;
                if (n!=1)
                    ans.append("*");
            }
        }
        System.out.println(ans);
    }
}
