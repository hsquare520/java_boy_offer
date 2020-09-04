package offer;

import java.util.*;

public class more_than_half {
    private String name;
    public int MoreThanHalfNum_Solution(int[] array) {
        int len = array.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (!map.containsKey(array[i])) {
                map.put(array[i], 1);
            } else map.put(array[i], map.get(array[i] + 1));
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() * 2 > len)
                return entry.getKey();
        }
        return 0;
    }

    public int morethanhalf(int[] arr) {
        int len = arr.length;
        Arrays.sort(arr);
        int mid = len / 2;
        int count = 0;
        for (int i = 0; i < len; i++) {
            if (arr[i] == arr[mid])
                count++;
        }
        if (count > mid) {
            return count;
        } else return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
}
