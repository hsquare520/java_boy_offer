package offer;

public class max_gift_Value {
    public int maxValue(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        dp[0][0]=grid[0][0];
        for (int i=0;i<m;i++)
            for (int j=0;j<n;j++){
                if (i==0&&j==0)
                    continue;
                if (i==0)
                    dp[i][j]=dp[i][j-1]+grid[i][j];
                else if (j==0)
                    dp[i][j]=dp[i-1][j]+grid[i][j];
                else
                    dp[i][j]=grid[i][j]+Math.max(dp[i-1][j],dp[i][j-1]);
            }
        return dp[m-1][n-1];
    }
}
