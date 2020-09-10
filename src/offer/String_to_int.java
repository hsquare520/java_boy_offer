package offer;

import java.util.Arrays;

public class String_to_int {
    public static int strToInt(String str){
        str=str.trim();
        if (str.length()==0)
            return 0;

        int flag=1;

        char[] str1=str.toCharArray();
        if (str1[0]=='+'||str1[0]=='-'||Character.isDigit(str1[0])){
            if (str1[0]=='+'||str1[0]=='-'){
                if (str1[0]=='-'){
                    flag=-1;
                }
                str1= Arrays.copyOfRange(str1,1,str1.length);
            }
            int index=0;
            int ans=0;
            while (index<str1.length&&Character.isDigit(str1[index])){
                int r=str1[index]-'0';
                if (ans>Integer.MAX_VALUE/10||(ans==Integer.MAX_VALUE/10&&r>7)){
                    return flag>0?Integer.MAX_VALUE:Integer.MIN_VALUE;
                }
                ans=ans*10+r;
                index++;
            }
            return flag>0? ans:-ans;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(strToInt("  -34"));
    }
}
