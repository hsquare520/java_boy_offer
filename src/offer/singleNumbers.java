package offer;

import java.util.*;

public class singleNumbers {
    public static int[] singleNumbers(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }
            else map.remove(nums[i]);
        }
        ArrayList<Integer> list=new ArrayList<>();
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            list.add(entry.getKey());
        }
        int[] ans=new int[2];
        for (int i=0;i<2;i++){
            ans[i]=list.get(i);
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] num={1,2,2,3,3,4};
        System.out.println(Arrays.toString(singleNumbers(num)));
    }
}
