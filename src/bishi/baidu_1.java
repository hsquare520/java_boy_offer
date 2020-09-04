package bishi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class baidu_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");
        int x0 = Integer.parseInt(list[0]);
        int y0 = Integer.parseInt(list[1]);
        String order = scanner.nextLine();
        char[] str = order.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            if (!map.containsKey(str[i])) {
                map.put(str[i], 1);
            } else map.put(str[i], map.get(str[i])+1);
        }
        int l = 0, r = 0, u = 0, d = 0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 'L')
                l=entry.getValue();
            if (entry.getKey() == 'R')
                r=entry.getValue();
            if (entry.getKey() == 'U')
                u=entry.getValue();
            if (entry.getKey() == 'D')
                d=entry.getValue();
        }
        int x = r - l;
        int y = u - d;
        System.out.print(x0 + x);
        System.out.print(" ");
        System.out.print(y0 + y);
    }
}
