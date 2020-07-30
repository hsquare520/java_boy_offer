package daily_leetcode;
//给定一个正整数 n，将其拆分为至少两个正整数的和，并使这些整数的乘积最大化。 返回你可以获得的最大乘积。
//2=<n<=58
//3作为最大因子角度考虑
public class day_3 {
    public static int integerBreak(int n) {
        int max = 1;
        if (n==2||n==3)
            return n-1;
        for (;n>4;n-=3){
            max*=3;
        }
        return max*n;
    }

    public static void main(String[] args) {
        System.out.println(integerBreak(10));
    }
}
