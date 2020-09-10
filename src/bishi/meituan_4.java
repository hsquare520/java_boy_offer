package bishi;

import java.util.Scanner;

public class meituan_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        String[] arr=scanner.nextLine().split(" ");
        int[] nums=new int[arr.length];
        for (int i=0;i<nums.length;i++)
            nums[i]=Integer.parseInt(arr[i]);
        int ans=0;
        for (int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++)
                ans^=(i%j);
        }
        System.out.println(ans);
    }
}
