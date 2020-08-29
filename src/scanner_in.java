import java.util.Scanner;

public class scanner_in {
//    每行输入带有空格的数字
//          6
//          2 1
//          3 2
//          4 3
//          5 2
//          6 1
//          123456
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = Integer.parseInt(in.nextLine())-1;
        int[][] num = new int[count][2];
        for(int i=0;i<count;i++){
            String temp = in.nextLine();
            String[] ss = temp.trim().split(" ");
            num[i][0] = Integer.parseInt(ss[0]);
            num[i][1] = Integer.parseInt(ss[1]);

        }
    }
//1234567891011


}
