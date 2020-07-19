import java.util.Arrays;

public class j_20 {
    public static void main(String[] args) {
        int[] num = {1, 2, 5, 3, 4, 23, -2};
        quick_sort(num, 0, 6);
        System.out.println(Arrays.toString(num));
    }

    public static void quick_sort(int[] nums, int left, int right) {
        int l = left, r = right;
        int privot = (left + right) / 2;
        while (l < r) {
            while (nums[l] < nums[privot])
                l++;
            while (nums[privot] < nums[r])
                r--;
            if (l > r)
                break;
            int temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;

            if (nums[l] == nums[privot])
                l++;
            if (nums[privot] == nums[r])
                r--;
        }
        if (l < right)
            quick_sort(nums, l, right);
        if (left < r)
            quick_sort(nums, left, r);
    }
}
