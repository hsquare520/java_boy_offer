package bishi;

import java.util.Scanner;

public class shenxinfu_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list=scanner.nextLine().split(" ");
        int[] num=new int[Integer.parseInt(list[1])];
        String[] strings=scanner.nextLine().split(" ");
        for (int i=0;i<strings.length;i++)
            num[i]=Integer.parseInt(strings[i]);
        int[] arr=new int[Integer.parseInt(list[1])+1];
        arr[0]=Integer.parseInt(list[1]);
        for (int i=1;i<arr.length;i++)
            arr[i]=num[i-1];
        System.out.println(fill2(arr)*Integer.parseInt(list[0]));
    }
    public static int fill2(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        int sum = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            sum += nums[i];
        }
        return fill2(nums, 0, nums.length - 1) - sum;
    }
    private static int fill2(int[] nums, int start, int end) {
        int sum = 0;
        if (nums[start] <= nums[end]) {
            int v = nums[start];
            sum += v;
            for (int i = start + 1; i <= end; i++) {
                if (nums[i] > v) {
                    sum += fill2(nums, i, end);
                    break;
                } else {
                    sum += v;
                }
            }
        } else {
            int v = nums[end];
            sum += v;
            for (int i = end - 1; i >= start; i--) {
                if (nums[i] > v) {
                    sum += fill2(nums, start, i);
                    break;
                } else {
                    sum += v;
                }
            }
        }
        return sum;
    }
}
