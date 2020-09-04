package bishi;

import java.util.Scanner;

public class huawwei_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int M=scanner.nextInt();
        int N=scanner.nextInt();
        int[] w=new int[N];
        int[] v=new int[N];
//        String[][] s=new String[2][N];
////        for (int i=0;i<2;i++){
////            s[1][N]= String.valueOf(scanner.nextLine().split(" "));
////        }
//        while (scanner.hasNext()){
//            String[] str1=scanner.nextLine().split(" ");
//            String[] str2=scanner.nextLine().split(" ");
//            scanner.close();
//        }

        String temp1 = scanner.nextLine();
        scanner.nextLine();
        String temp2 = scanner.nextLine();
//        char[] s1=str1[0].toCharArray();
//        char[] s2=str2[1].toCharArray();
//        String[] s1=str1.trim().split(" ");
//        String[] s2=str2.trim().split(" ");
//
        String[] str1=temp1.split(" ");
        String[] str2=temp2.split(" ");
        for (int i=0;i<N;i++)
            w[i]=Integer.parseInt(str1[i]);
        for (int i=0;i<N;i++)
            v[i]=Integer.parseInt(str2[i]);
        int[][] temp=new int[N][M+1];
        for (int i=0;i<M+1;i++)
            temp[0][i]=0;
        for (int i=1;i<N;i++)
            temp[i][0]=0;
        for (int i=1;i<N;i++){
            for (int j=1;j<M+1;j++){
                if(w[i]<=j){
                    temp[i][j]=Math.max(temp[i-1][j],temp[i-1][j-w[i]]+v[i]);
                }
                else temp[i][j]=temp[i-1][j];
            }
        }
        System.out.println(temp[N-1][M]);
    }
}
