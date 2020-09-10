package offer;

import java.util.Stack;

public class offer_21_exchange {
    public int[] exchange(int[] nums) {
        int[] res=new int[nums.length];
        int left=0;
        int right=nums.length-1;
        for (int i=0;i<nums.length;i++){
            if (nums[i]%2!=0){
                res[left]=nums[i];
                left++;
            }
            else {
                res[right]=nums[i];
                right--;
            }
        }
        return res;
    }
}
