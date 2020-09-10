package bishi;

import java.util.Scanner;

public class tc58_test {
    public static String AZ(int num){
        String tcMsg = "";
        char sl = 0;
        if (-1 < num && num < 10) {
            tcMsg = "" + num;
        } else if (9 < num && num < 36) {
            sl = (char) (num - 10 + (int) 'A');
            tcMsg = "" + sl;
        } else if (35 < num && num < 62) {
            sl = (char) (num - 36 + (int) 'a');
            tcMsg = "" + sl;
        }
        return tcMsg;
    }


    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int a=scanner.nextInt();
//        int b=scanner.nextInt();
        System.out.println(AZ(12158));
    }
}
