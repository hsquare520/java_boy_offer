package bishi;

import java.util.*;

public class tencent_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int[] arr=new int[n];
        int[] list_copy=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
        }
        list_copy=Arrays.copyOf(arr,n);
        HashMap<Integer,Integer> map=new HashMap<>();
        Arrays.sort(arr);
        for (int i=0;i<n/2;i++){
            map.put(arr[i],arr[n/2]);
        }
        for (int i=n/2;i<n;i++){
            map.put(arr[i],arr[n/2-1]);
        }
        for (int i=0;i<n;i++){
            System.out.println(map.get(list_copy[i]));
        }
    }

}
