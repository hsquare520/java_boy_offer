package bishi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class baidu_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] list = scanner.nextLine().split(" ");
        int n=Integer.parseInt(list[0]);
        int m=Integer.parseInt(list[1]);
        int k=Integer.parseInt(list[2]);
        int[][] arr=new int[n][3];
        for (int i=0;i<n;i++){
            String temp = scanner.nextLine();
            String[] ss = temp.trim().split(" ");
            arr[i][0]=Integer.parseInt(ss[0]);
            arr[i][1]=Integer.parseInt(ss[1]);
            arr[i][2]=Integer.parseInt(ss[2]);
        }

        System.out.println("2");

        int res=0;
//      按列从大到小，第三列
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return t1[2]-ints[2];
            }
        });
//       按列从小到大，第二列
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[1]-t1[1];
            }
        });
//        按列从小到大，第一列
        Arrays.sort(arr, new Comparator<int[]>() {
            @Override
            public int compare(int[] ints, int[] t1) {
                return ints[0]-t1[0];
            }
        });
        System.out.println(Arrays.deepToString(arr));
    }


}

//#include <iostream>
//#include <vector>
//#include <algorithm>
//using namespace std;
//
//struct P{
//        int price;
//        int weight;
//        int heart;
//};
//
//bool cmp(P a, P b){
//    if(a.heart != b.heart) return a.heart > b.heart;
//    else if(a.price != b.price) return a.price < b.price;
//    else return a.weight < b.weight;
//}
//
//int main(){
//    int n, m ,k;
//    cin >> n >> m >> k;
//    vector<P> p(n);
//    for(int i = 0; i < n; ++i){
//        cin >> p[i].price >> p[i].weight >> p[i].heart;
//    }
//
//    sort(p.begin(), p.end(), cmp);
//    int barget = 0, w = 0, ans = 0;
//    for(int i = 0; i < n; ++i){
//        barget += p[i].price;
//        w += p[i].weight;
//        if(barget > k || w > m) break;
//        else ans++;
//    }
//
//    cout << ans << '\n';
//}