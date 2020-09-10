package read_me;

import java.util.Arrays;

public class j_20 {
    public static void quicksort(int[] num, int left,int right){
        int l=left,r=right,mid=(left+right)/2;
        while (l<r){
            while (num[l]<num[mid])
                l++;
            while (num[r]>num[mid])
                r--;
            int temp =num[l];
            num[l]=num[r];
            num[r]=temp;
            if (num[l]==num[mid])
                l++;
            if (num[r]==num[mid])
                r--;
        }
        if (l<right)
            quicksort(num,l,right);
        if (left<r)
            quicksort(num,left,r);
    }

    public static void main(String[] args) {
        int[] num = {4,-2,98,5,7,9,-3,3,-3,-3};
        quicksort(num,0,num.length-1);
        System.out.println(Arrays.toString(num));
    }
}
