package daily_leetcode;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
//
// 
//
//提示：
//
//num1 和num2 的长度都小于 5100
//num1 和num2 都只包含数字 0-9
//num1 和num2 都不包含任何前导零
//你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
//
//来源：力扣（LeetCode）
//链接：https://leetcode-cn.com/problems/add-strings
//著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
public class day_7 {
//    public static int addStrings(String num1, String num2) {
//        int len1 = num1.length();
//        int len2 = num2.length();
//        int len = Math.min(len1, len2);
//        StringBuffer res = new StringBuffer();
//        for (int i = len; i >= 0; i--) {
//            int in = 0;
//            int a = num1.charAt(len1 - 1);
//            int b = num2.charAt(len2 - 1);
//            if (a + b + in <= 9) {
//                res.append(a+b+in);
//                in=0;
//            }
//            if (a+b+in>9){
//                in+=1;
//                int yushu=(a+b+in)%10;
//                res.append(yushu);
//            }
//        }
//        return Integer.parseInt(String.valueOf(res));
//    }

    public static void main(String[] args) {
        String num1="123";
        String num2 = "36";
        int len1 = num1.length()-1;
        int len2 = num2.length()-1;
        int add=0;
        StringBuffer res = new StringBuffer();
        while (len1>=0||len2>=0||add!=0){
            int a=len1>=0?num1.charAt(len1--)-'0':0;

            int b=len2>=0?num2.charAt(len2--)-'0':0;
            int ans=a+b+add;
            res.append(ans%10);
            add=ans/10;
        }
        System.out.println(res.reverse());
//        res.append(1);
//        res.append(2);
//        System.out.println(res);
//        System.out.println(res.reverse());
//        int in=0;
//        for (int i = len; i > 0; i--) {
//            int a = Integer.parseInt(String.valueOf(num1.charAt(len1-1)));
//            int b = Integer.parseInt(String.valueOf(num2.charAt(len2-1)));
//
//            if (a+b+in<=9){
//                res.append(a+b+in);
//            }
//            else if (a+b+in>9){
//                int yushu=(a+b+in)%10;
//                res.append(yushu);
//                in+=1;
//            }
//            len1--;
//            len2--;
//        }
//        if (len1>0)
//            for (int i=len1-len;i>0;i--);
//                int c=Integer.parseInt(String.valueOf(num1.charAt(len1-len-1)));
//                if (in==0)
//                    res.append(c);
//                else res.append(c+in);
//                len1--;
//        System.out.println(res.reverse());

    }
}
