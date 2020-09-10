package read_me;

import java.util.Arrays;

public class j_3 {
    //    给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
//    说明:初始化 nums1 和 nums2 的元素数量分别为 m 和 n。你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
//    示例:输入:nums1 = [1,2,3,0,0,0], m = 3; nums2 = [2,5,6], n = 3
//    输出: [1,2,2,3,5,6]
//
//作者：公众号_程序员乔戈里
//链接：https://juejin.im/post/5bee5089e51d4538670b00d7
//来源：掘金
//著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
    public static int[] merge_array(int[] nums1, int len1, int[] nums2, int len2) {
        int k = len1 + len2 - 1;
        int i = len1 - 1;
        int j = len2 - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j])
                nums1[k--] = nums1[i--];
            else nums1[k--] = nums2[j--];
        }
        if (i > 0) {
            while (i >= 0) {
                nums1[k--] = nums1[i--];
            }
        }
        if (j > 0) {
            while (j >= 0) {
                nums1[k--] = nums2[j--];
            }
        }
        return nums1;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 4};
        int m = 3;
        int n = 2;
        int[] ans = merge_array(num1, m, num2, n);
        System.out.println(Arrays.toString(ans));
    }
}
