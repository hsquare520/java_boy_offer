package bishi;

public class dianxin_2 {
    public static void main(String[] args) {
        int a,b,c,d;
        for (int i=0;i<10000;i++){
            a=i/1000;
            b=(i-a*1000)/100;
            c=(i-a*1000-b*100)/10;
            d=i-a*1000-b*100-c*10;
            if ((i+b*1000+c*100+d*10+a)==8888&&d>=0){
                System.out.print(a+" ");
                System.out.print(b+" ");
                System.out.print(c+" ");
                System.out.print(d);
                System.out.println();
            }
        }
    }
}
