package offer;

public class offer_14_cuttingRope {
    public int cuttingRope(int n){
        if (n==1||n==2)
            return n-1;
        int res=1;
        for (;n>4;n-=3){
            res*=3;
        }
        return res*n;
    }
}
