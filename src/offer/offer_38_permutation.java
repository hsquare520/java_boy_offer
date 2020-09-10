package offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class offer_38_permutation {
    List<String> list=new ArrayList<>();
    char[] c;
    public String[] permutation(String s){
        c=s.toCharArray();
        dfs(0);
        return list.toArray(new String[list.size()]);
    }
    public void dfs(int x){
        if (x==c.length-1){
            list.add(String.valueOf(c));
            return;
        }
        boolean[] visit = new boolean[26];
        for (int i=0;i<c.length;i++){
            if (visit[c[i]-'a'])
                continue;
            visit[c[i]-'a']=true;
            swap(i,x);
            dfs(x+1);
            swap(i,x);
        }
    }
    public void swap(int a,int b){
        char tmp=c[a];
        c[a]=c[b];
        c[b]=tmp;
    }

    public static void main(String[] args) {
        offer_38_permutation offer_38_permutation = new offer_38_permutation();
        System.out.println(Arrays.toString(offer_38_permutation.permutation("abc")));
    }
}
