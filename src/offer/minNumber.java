package offer;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class minNumber {
    public String minNumber(int[] nums){
        String[] str=new String[nums.length];
        for (int i=0;i<nums.length;i++){
            str[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(str,(x,y)->(x+y).compareTo(y+x));
        StringBuilder stringBuilder=new StringBuilder();
        for (String s:str){
            stringBuilder.append(s);
        }
        return stringBuilder.toString();
    }
}
