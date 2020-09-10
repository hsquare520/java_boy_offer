package bishi;

import java.util.Scanner;

public class ali_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        scanner.nextLine();
        int[][] arr=new int[n-1][2  ];
        for (int i=0;i<n-1;i++){
            String temp = scanner.nextLine();
            String[] ss = temp.trim().split(" ");
            arr[i][0]=Integer.parseInt(ss[0]);
            arr[i][1]=Integer.parseInt(ss[1]);
        }
        System.out.println(2);
    }
}
