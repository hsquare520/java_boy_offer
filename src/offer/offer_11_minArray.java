package offer;

public class offer_11_minArray {
    public int minArray(int[] numbers){
        int low=0;
        int high=numbers.length-1;
        while (low<high){
            int mid=(low+high)/2;
            if (numbers[mid]<numbers[high])
                high=mid;
            else if (numbers[mid]>numbers[high])
                low=mid+1;
            else high-=1;
        }
        return numbers[low];
    }
}
