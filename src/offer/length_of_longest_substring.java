package offer;

public class length_of_longest_substring {
    public int lengthOfLongestSubstring(String s){
        int head=0;
        int tail=0;
        int res=1;
        if (s.length()<2)
            return s.length();
        while (tail<s.length()-1){
            tail++;
            if (!s.substring(head,tail).contains(s.substring(tail,tail+1)))
                res=Math.max(tail-head+1,res);
            else {
                while (s.substring(head,tail).contains(s.substring(tail,tail+1)))
                    head++;
            }
        }
        return res;
    }
}
