package offer;

public class offer_17_printNumbers {
    public int[] printNumbers(int n){
        int m=(int) Math.pow(10,n)-1;
        int[] res=new int[m];
        for (int i=0;i<m;i++){
            res[i]=i=1;
        }
        return res;
    }
}
