package offer;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class findRepeatNumber {
    public static int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return nums[i];
        }
        return -1;
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            if (!map.containsKey(nums[i]))
//                map.put(nums[i], 1);
//            else map.put(nums[i], map.get(nums[i] + 1));
//        }
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            if (entry.getValue() > 1)
//                return entry.getKey();
//        }
//        return 0;
    }

    public int findRepeatNumber2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int length = nums.length;
        for (int i = 0; i < length; i++) {
            if (!map.containsKey(nums[i]))
                map.put(nums[i], 1);
            else map.put(nums[i], map.get(nums[i]) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1)
                return entry.getKey();
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 4};
        System.out.println(findRepeatNumber(num));
    }
}
