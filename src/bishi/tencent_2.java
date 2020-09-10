package bishi;

import java.util.*;

public class tencent_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int m=scanner.nextInt();
        Set<Integer>[] sets=new Set[m];
        for (int i=0;i<m;i++){
            int x=scanner.nextInt();
            Set<Integer> set=new HashSet<>();
            for (int j=0;j<x;j++){
                set.add(scanner.nextInt());
            }
            sets[i]=set;
        }
        HashSet<Integer> ans=new HashSet<>();
        ans.add(0);
        Queue<Integer> queue=new LinkedList<>();
        queue.add(0);
        while (!queue.isEmpty()){
            int temp=queue.peek();
            for (int i=0;i<m;i++){
                if (sets[i].contains(temp)){
                    for (Integer num:sets[i]){
                        if (!ans.contains(num)){
                            queue.add(num);
                        }
                        ans.add(num);
                    }
                }
            }
            queue.poll();
        }
        System.out.println(ans.size());
    }
}
