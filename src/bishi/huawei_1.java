package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class huawei_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String NN=scanner.nextLine();
        int N = Integer.parseInt(NN);
        int[][] num = new int[N][2];
        for (int i = 0; i < N; i++) {
            String temp = scanner.nextLine();
            String[] ss = temp.trim().split(" ");
            num[i][0] = Integer.parseInt(ss[0]);
            num[i][1] = Integer.parseInt(ss[1]);
        }
        System.out.println(tangguo(num));
    }
    public static int[] tangguo(int[][] num){
        int N=num[0].length;
        int count=0;
        for (int i=0;i<N;i++){
            count+=num[i][0];
        }
        int count1=0;
        int count2=0;
        for (int i=0;i<N;i++){
            if (num[i][1]==1)
                count1+=num[i][0];
            else count2+=num[i][0];
        }
        if (count1*2<count&&count2*2<count)
            return null;
        return null;
    }

}
