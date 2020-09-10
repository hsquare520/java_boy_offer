package offer;

public class offer_20_isNumber {
    public boolean isNumber(String s){
        s=s.trim();
        s.toLowerCase();
        boolean hasNum=false;
        boolean hasPoint=false;
        boolean hasE=false;
        boolean hasNumafterE=true;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c>='0'&&c<='9'){
                hasNum=true;
                hasNumafterE=true;
            }
            else if (c=='.'){
                if (hasE||hasPoint)
                    return false;
                hasPoint=true;
            }
            else if (c=='e'){
                if (hasE||!hasNum)
                    return false;
                hasE=true;
                hasNumafterE=false;
            }
            else if (c=='+'||c=='-'){
                if (i!=0&&s.charAt(i-1)!='e')
                    return false;
            }
            else return false;
        }
        return hasNum&&hasNumafterE;
    }
}
