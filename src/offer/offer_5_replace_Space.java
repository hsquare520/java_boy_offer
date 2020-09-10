package offer;

public class offer_5_replace_Space {
    public String replaceSpace(String s){
        StringBuffer str=new StringBuffer();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==' ')
                str.append("%20");
            else str.append(s.charAt(i));
        }
        return str.toString();
    }
}
