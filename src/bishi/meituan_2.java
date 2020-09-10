package bishi;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class meituan_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        Set<Integer> set=new HashSet<>();
        for (int i=0;i<p;i++){
            set.add(scanner.nextInt());
        }
        for (int j=0;j<q;j++){
            set.add(scanner.nextInt());
        }
        System.out.println(set.size()-q);
        System.out.println(set.size()-p);
        System.out.println(p+q-set.size());
    }
}
