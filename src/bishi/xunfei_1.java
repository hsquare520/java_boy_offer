package bishi;

import java.util.Scanner;
//礼物最大值，只能向右走和下走
public class xunfei_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(",");
        int[][] arr=new int[Integer.parseInt(list[0])][Integer.parseInt(list[1])];
        for (int i=0;i<Integer.parseInt(list[0]);i++)
            for (int j=0;j<Integer.parseInt(list[1]);j++)
                arr[i][j]=scanner.nextInt();
        System.out.println(getMost(arr));
    }
    public static int getMost(int[][] values) {
        if (values == null || values.length == 0 || values[0].length == 0)
            return 0;
        int n = values[0].length;
        int[] dp = new int[n];
        for (int[] value : values) {
            dp[0] += value[0];
            for (int i = 1; i < n; i++)
                dp[i] = Math.max(dp[i], dp[i - 1]) + value[i];
        }
        return dp[n - 1];
    }

}
