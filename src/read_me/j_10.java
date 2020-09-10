package read_me;

public class j_10 {
    public static void main(String[] args) {
        System.out.println(sqrt(4.1, 0.001));
    }

    public static double sqrt(double x, double k) {
        double small = x > 1 ? 0 : x;
        double big = x > 1 ? x : 1;
        double res = x;
        while (true) {
            double diff = res * res - x;
            if (Math.abs(diff) < k) {
                break;
            } else if (diff > 0) {
                big = res;
            } else if (diff < 0) {
                small = res;
            }
            res = (small + big) / 2;
        }
        return res;

//
//        double min=0,max=x;
//        double ans = 0;
//
//        if ()
//
//        while (min<=max){
//            double mid=(min+max);
//            if (x-mid*mid>=k){
//                ans= mid;
//                min =mid;
//            }
//            else max=mid;
//        }
//        return ans;
    }
}
