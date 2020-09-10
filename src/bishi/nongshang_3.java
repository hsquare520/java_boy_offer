package bishi;

import java.util.HashMap;
import java.util.Scanner;

public class nongshang_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        scanner.nextLine();
        String[] list = scanner.nextLine().split(" ");
        int[] arr = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = Integer.parseInt(list[i]);
        }
        System.out.println(findMaxLength(arr));
    }

    public static int findMaxLength(int[] nums) {
        int len = nums.length;
        if (len <= 1) return 0;
        int count = 0;
        int maxLen = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            if (nums[i] == 1) count++;
            else if (nums[i] == 0) count--;

            if (map.containsKey(count)) {
                maxLen = Math.max(maxLen, i - map.get(count));
            } else {
                map.put(count, i);
            }
        }
        return maxLen;
    }


}
