package bishi;

import java.util.Arrays;

public class sougou_2 {
    public static int getHouses (int t, int[] xa) {
        // write code here
        int[] x=new int[xa.length/2];
        int[] a=new int[xa.length/2];
        for (int i=0;i<xa.length;i++){
            if (i%2==0)
                x[i/2]=xa[i];
            else a[i/2]=xa[i];
        }
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(a));
        double[] l=new double[x.length];
        for (int i=0;i<x.length;i++){
            l[i]=x[i]-a[i]/2;
        }
        double[] r=new double[x.length];
        for (int i=0;i<x.length;i++){
            r[i]=x[i]+a[i]/2;
        }
//        System.out.println(Arrays.toString(l));
//        System.out.println(Arrays.toString(r));
        double[] now=new double[l.length+r.length];
        int count=0;
        for (int i=1;i<r.length;i++){
            if (l[i]-r[i-1]>t){
                count+=2;
            }
            else if (l[i]-r[i-1]==t){
                count++;
            }
        }
        return count+2;
    }

    public static void main(String[] args) {
        int[] arr={-1,4,5,2};
        System.out.println(getHouses(2,arr));
    }

    public static int getHouses1 (int t, int[] xa){
        int way=2;
        for (int i=2;i<xa.length-2;i=i+2){
            if ((xa[i]-xa[i+1]/2.0)-(xa[i-2]+xa[i-1]/2.0)>t){
                way+=2;
            }
            else if ((xa[i]-xa[i+1]/2.0)-(xa[i-2]+xa[i-1]/2.0)==t){
                way+=1;
            }
        }
        return way;
    }
}
