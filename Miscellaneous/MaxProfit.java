package Miscellaneous;

public class MaxProfit {

    public static int maxProfit(int[] a) {
    int profit = 0;
    for (int i=1 ; i<a.length ; ++i) {
        if(a[i] - a[i-1] > 0) {
             profit = profit + (a[i] - a[i-1]);
        }
    }
    return profit;
    }

    public static void main(String args[]) {
        int[] a = {0,50,10,100,30};
        System.out.println(maxProfit(a));
    }
}
