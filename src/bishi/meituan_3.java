package bishi;

import jdk.dynalink.NamedOperation;

import java.util.Scanner;

public class meituan_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n=scanner.nextInt();
            scanner.nextLine();
            String[] str=scanner.nextLine().split(" ");
            int[] arr=new int[str.length];
            boolean flag=true;
            for (int i=0;i<arr.length;i++) {
                arr[i] = Integer.parseInt(str[i]);
                if (arr[i]%2==0){
                    System.out.println("NO");
                    flag=false;
                    break;
                }

            }
            while (flag){
                System.out.println("YES");
                break;
            }
        }
    }
}
