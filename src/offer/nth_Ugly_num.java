package offer;

public class nth_Ugly_num {
    public int nthUglyNumber(int n) {
        int p2=0,p3=0,p5=0;
        int[] dp=new int[n];
        dp[0]=1;
        for (int i=1;i<n;i++){
            dp[i]=Math.min(dp[p2]*2,dp[p3]*3);
        }
        return 1;
    }
}
