package bishi;

public class bilibili_3 {
    public static String print_diamond (int n) {
        // write code here
        if (n%2==0||n<0)
            return "";
        StringBuffer res= new StringBuffer();
        for (int i=0;i<=n/2;++i){
            res.append(print_row(i,n));
            res.append('|');
        }
        for (int i=n/2-1;i>=0;i--){
            res.append(print_row(i,n));
            res.append('|');
        }
        return res.toString();
    }
    public static StringBuffer print_row(int i,int n){
        int k=2*i+1;
        StringBuffer res=new StringBuffer();
        int cnt=1;
        for (int j=0;j<=n/2;j++){
            if (j<(n-k)/2){
                res.append("*");
                continue;
            }
            res.append(cnt);
            cnt++;
        }
        String temp=res.toString().substring(0,res.length()-1);
        StringBuffer cp=new StringBuffer();
        cp.append(temp);
        cp.reverse();
        StringBuffer ans=new StringBuffer();
        ans.append(res).append(cp);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(print_diamond(5));
    }
}
//