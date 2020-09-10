package read_me;

import java.util.Arrays;
import java.util.List;

public class j_26 {
    public static boolean is_ip(String ip){
        if (ip.length()<7||ip.length()>15)
            return false;
        String[] str = ip.split("\\.");
        if (str.length!=4)
            return false;
        for (String s : str) {
            if (Integer.parseInt(s) < 0 || Integer.parseInt(s) > 255)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String ip = "123!45.67.276";
        System.out.println(Arrays.toString(ip.split("\\.")));
        System.out.println(is_ip(ip));
    }
}
