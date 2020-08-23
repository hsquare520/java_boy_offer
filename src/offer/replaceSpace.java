package offer;

public class replaceSpace {
    public String replaceSpace(String s) {
        StringBuffer Str = new StringBuffer();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' ')
                Str.append(s.charAt(i));
            else Str.append("%20");
        }
        return Str.toString();
    }
}
