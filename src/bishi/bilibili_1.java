package bishi;

import java.util.Arrays;
import java.util.Scanner;

public class bilibili_1 {
    public static void main(String[] args) {

        int[] a = new int[args.length];

        for (int i = 0; i < args.length; i++) {

            a[i] = Integer.parseInt(args[i]);

        }
        int[] b = new int[a[0]];
        int k = 0;

        for (int j = a[0]; j >= 1; j--) {

            if (a[0] % j == 0) {
                b[k] = j;
                k++;
                if (k > a[0]) {
                    break;
                }
            }

        }

        //做判断得到最大公约数
        Arrays.sort(a);

        int d;
        for (int i = a[0]; i >= 1; i--) {

            for (d = 0; d < a.length; d++) {


                if (a[d] % i != 0) {

                    b[i - 1] = 0;

                } else {
                    b[i - 1] = i;
                }

            }

        }

        Arrays.sort(b);
        System.out.println(b[b.length - 1]);
    }

    public int cal_max_common_factor (int[] a) {
        int[] b = new int[a[0]];
        int k = 0;
        for (int j = a[0]; j >= 1; j--) {
            if (a[0] % j == 0) {
                b[k] = j;
                k++;
                if (k > a[0]) {
                    break;
                }
            }
        }
        Arrays.sort(a);
        int d;
        for (int i = a[0]; i >= 1; i--) {
            for (d = 0; d < a.length; d++) {
                if (a[d] % i != 0) {
                    b[i - 1] = 0;
                } else {
                    b[i - 1] = i;
                }
            }
        }
        Arrays.sort(b);
        return b[b.length - 1];
    }
}









