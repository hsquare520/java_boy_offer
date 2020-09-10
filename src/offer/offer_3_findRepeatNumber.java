package offer;

import java.util.HashMap;
import java.util.Map;

public class offer_3_findRepeatNumber {
    public int findRepeatNumber(int[] nums) {
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
}
