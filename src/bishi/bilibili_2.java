package bishi;

public class bilibili_2 {
    public int[] find_children (int candiesNeed, int[] candies) {
        // write code here
        for (int i=0;i<candies.length-1;i++)
            for (int j=1;j<candies.length;j++){
                if (candies[i]+candies[j]==candiesNeed)
                    return new int[] {i,j};
            }
        return new int[]{-1,-1};
    }
}
