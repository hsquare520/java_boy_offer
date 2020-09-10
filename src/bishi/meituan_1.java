package bishi;

import java.util.Scanner;

public class meituan_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string=scanner.nextLine();
        char[] c=string.toCharArray();
        int daxie=0;
        int xiaoxie=0;
        int num=0;
        for(int i=0;i<string.length();i++){
            if(c[i]>='a'&&c[i]<='z'){
                xiaoxie++;
            }else if(c[i]>='A'&&c[i]<='Z'){
                daxie++;
            }
        }
        int res=Math.abs((daxie-xiaoxie))/2;
        System.out.println(res);
    }
}
