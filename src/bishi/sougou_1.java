package bishi;

import java.util.Arrays;

public class sougou_1 {
    public static int numberofprize (int a, int b, int c) {
        // write code here
        int[] arr={a,b,c};
        Arrays.sort(arr);
        int min=arr[0];
        int temp1=arr[1]-arr[0];
        int temp2=arr[2]-arr[0];
        int tem=temp1+temp2;
        int ans=tem/4;
        return min+ans;
    }

    public static int numberofprize1 (int a, int b, int c){
        int[] arr={a,b,c};
        Arrays.sort(arr);
        int min=arr[0];
        int mid=arr[1];
        int max=arr[2];
        int t=(mid-min)/2;
        if (t>0){
            return min+t+((max-t)-(min+t))/2;
        }
        else return min+(max-min)/4;
    }

    public static void main(String[] args) {
        System.out.println(numberofprize1(9,3,3));
    }
}
