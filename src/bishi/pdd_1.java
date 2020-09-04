package bishi;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class pdd_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str=scanner.nextLine().split(" ");
        int n=Integer.parseInt(str[0]),m=Integer.parseInt(str[1]);
        int[] arr=new int[m];
        for (int i=0;i<m;i++)
            arr[i]=scanner.nextInt();
        int ans=0;
        ArrayList<Integer> list=new ArrayList<>();

        HashSet<Integer> set=new HashSet<>();
        for (int i=0;i<arr.length;i++){
            int[] res=special(n,arr[i]);
            for (int j=0;j<res.length;j++){
                if (!set.contains(res[j])){
                    set.add(res[j]);
                }
            }
        }
        System.out.println(set.size());
    }
    public static int[] special(int n,int m){
        ArrayList<Integer> count = new ArrayList<>();
        for (int i=1;i<=n;i++){
            if (i%m==0)
                count.add(i);
        }
        int[] ans=new int[count.size()];
        for (int i=0;i<count.size();i++){
            ans[i]=count.get(i);
        }
        return ans;
    }
}
