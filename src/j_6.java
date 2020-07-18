public class j_6 {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 4, 3, 2,1};
        int i = 0;
        int j = num.length - 1;
        int count = 0;
        while (i < j) {
            if (num[i] < num[j]) {
                i++;
            } else if (num[i] > num[j]) {
                j--;
            }
            count++;
            i++;
            j--;
        }
        System.out.println(count);
    }
//    public static int diff_count(int[] num){
//        int i=0;
//        int j=num.length-1;
//        int count=0;
//        while (i<=j){
//            if (num[i]<num[j]){
//                i++;
//            }
//            else if (num[i]>num[j]){
//                j--;
//            }
//            count++
//            i++,j--;
//        }
//        return count;
//    }
}
