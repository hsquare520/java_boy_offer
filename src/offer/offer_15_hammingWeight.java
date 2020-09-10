package offer;

public class offer_15_hammingWeight {
    public int hammingWeight(int n){
        int res=0;
        while (n!=0){
            res=res+n&1;
            n>>>=1;
        }
        return res;
    }
}
