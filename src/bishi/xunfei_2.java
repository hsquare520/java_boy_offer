package bishi;

import java.util.Arrays;
import java.util.Scanner;
//冒泡排序
import static java.lang.Integer.parseInt;

public class xunfei_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len=Integer.parseInt(scanner.nextLine());
        String[] nums=scanner.nextLine().split(",");
        int[] arr=new int[len];
        for (int i=0;i<nums.length;i++){
            arr[i]= parseInt(nums[i]);
        }
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
        StringBuffer ans=new StringBuffer();
        for (int i=0;i<len;i++){
            ans.append(arr[i]);
            if (i!=len-1)
                ans.append(',');
        }

        System.out.println(ans);
    }
}
