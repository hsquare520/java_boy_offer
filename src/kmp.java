import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class kmp {
    // 构造模式串 pattern 的最大匹配数表
    public static int[] calculateMaxMatchLengths(String pattern) {
        var maxMatchLengths = new int[pattern.length()];
        int maxLength = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (maxLength > 0 && pattern.charAt(maxLength) != pattern.charAt(i)) {
                maxLength = maxMatchLengths[maxLength - 1]; // ①
            }
            if (pattern.charAt(maxLength) == pattern.charAt(i)) {
                maxLength++; // ②
            }
            maxMatchLengths[i] = maxLength;
        }
        return maxMatchLengths;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(calculateMaxMatchLengths("abbaaba")));
//        System.out.println(Arrays.toString(max_match_pattern("abababzababab")));
        System.out.println(search("abbaavvvabbaaba", "abbaaba"));
        System.out.println(kmp("abbaavvvabbaaba", "abbaaba"));
    }

    public static int[] max_match_pattern(String pattern) {
        var max_match_len = new int[pattern.length()];
        var now_len = 0;
        for (int i = 1; i < pattern.length(); i++) {
            while (now_len > 0 && pattern.charAt(now_len) != pattern.charAt(i))
                now_len = max_match_len[now_len - 1];
            if (pattern.charAt(now_len) == pattern.charAt(i)) {
                now_len++;
            }
            max_match_len[i] = now_len;
        }
        return max_match_len;
    }


    // 在文本 text 中寻找模式串 pattern，返回所有匹配的位置开头
    public static List<Integer> search(String text, String pattern) {
        List<Integer> positions = new ArrayList<>();
        int[] maxMatchLengths = calculateMaxMatchLengths(pattern);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            while (count > 0 && pattern.charAt(count) != text.charAt(i)) {
                count = maxMatchLengths[count - 1];
            }
            if (pattern.charAt(count) == text.charAt(i)) {
                count++;
            }
            if (count == pattern.length()) {
                positions.add(i - pattern.length() + 1);
                count = maxMatchLengths[count - 1];
            }
        }
        return positions;
    }

    public static List<Integer> kmp(String text, String pattern) {
        List<Integer> position = new ArrayList<>();
        int[] max_match_len = max_match_pattern(pattern);
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            while (count > 0 && pattern.charAt(count) != text.charAt(i))
                count = max_match_len[count - 1];
            if (pattern.charAt(count) == text.charAt(i))
                count++;
            if (count==pattern.length()){
                position.add(i-pattern.length()+1);
                count=max_match_len[count-1];
            }
        }
        return position;
    }
}
