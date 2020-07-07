public class j_5 {
    //    题目：求解一个有序数组不同平方值的个数，{-1,-1,0,1,1}这里平方值只有0，1两种情况，返回2；
//    {-3,-1,0,0,2,3}这里拼房族有0，1，4，9共4中情况，返回4。

//    思路：数组有序，需要计算的是不同的平方和，那么平方和相同时有两种情况，
//    一：两个元素是相邻元素，元素值本身相同；
//    二：两个元素绝对值相等；
//    对于第一种情况可以直接比较是否与相邻元素相等，相等时不计数；
//    对于第二种情况利用数组有序的条件，使用双指针分别指向数组的头和尾，相等时不计数。两指针向中间移动。

    public static int diff_count(int[] nums) {
        int left = 0, right = nums.length - 1;
        int conut = 0;
        while (left < right) {
            while (nums[left] * nums[left] == nums[right] * nums[right])
                left++;
            if (nums[left] * nums[left] >= nums[right] * nums[right]) {
                while (left < right && nums[left] * nums[left] == nums[left + 1] * nums[left + 1])
                    left++;
                left++;
            } else {
                while (left < right && nums[right] * nums[right] == nums[right - 1] * nums[right - 1])
                    right--;
                right--;
            }
            conut++;
        }
        return conut;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 1, 1, 3, 3, 3, 5};
        System.out.println(diff_count(nums));
    }
}