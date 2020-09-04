package bishi;

import java.util.Scanner;

public class huawei_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str=scanner.nextLine().split(",");
        char[][] arr=new char[Integer.parseInt(str[0])][Integer.parseInt(str[1])];
        for (int i=0;i<Integer.parseInt(str[0]);i++){
            String temp = scanner.nextLine();
            char[] string=temp.toCharArray();
            for (int j=0;j<Integer.parseInt(str[1]);j++){
                arr[i][j]=string[j];
            }
        }
        System.out.println(lake(arr));
    }
    public static int lake(char[][] arr){
        int m=arr.length,n=arr[0].length;
        int count=0;
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (arr[i][j]=='S'){
                    dfs(arr,i,j);
                    count++;
                }
            }
        return count;
    }
    public static void dfs(char[][] arr,int i,int j){
        if (i<0||j<0||i>=arr.length||j>=arr[0].length)
            return;
        if (arr[i][j]=='S'){
            arr[i][j]='H';
            dfs(arr,i-1,j);
            dfs(arr,i+1,j);
            dfs(arr,i,j-1);
            dfs(arr,i,j+1);
        }


    }
}
