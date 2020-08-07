package daily_leetcode;

import java.util.ArrayList;
import java.util.List;

public class day_10 {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && isHui(words[i], words[j])) {
                    List<Integer> r = new ArrayList<Integer>();
                    r.add(i);
                    r.add(j);

                    res.add(r);
                }
            }
        }
        return res;
    }

    public boolean isHui(String a, String b) {
        int lena = a.length();
        int lenb = b.length();
        int len = lena + lenb;


        if (lena > lenb) {
            for (int i = 0; i < len / 2; i++) {
                if (lenb - i - 1 >= 0 && a.charAt(i) != b.charAt(lenb - i - 1)) return false;
                if (lenb - i - 1 < 0 && a.charAt(i) != a.charAt(lena + (lenb - i - 1))) return false;
            }
        } else {
            for (int i = 0; i < len / 2; i++) {
                if (lena - i - 1 >= 0 && a.charAt(i) != b.charAt(lenb - i - 1)) return false;
                if (lena - i - 1 < 0 && b.charAt(i - lena) != b.charAt(lenb - i - 1)) return false;
            }
        }

        return true;
    }
}
