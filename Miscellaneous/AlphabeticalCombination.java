package Miscellaneous;

import java.util.HashMap;
import java.util.HashSet;

public class AlphabeticalCombination {

    public static int combinationAlphabets(int n) {

        String i = String.valueOf(n);
        int arr[] = new int[i.length()];
        for(int j=0 ; j<arr.length ; j++) {
            arr[j] = i.charAt(j) - '0';
        }

        int combination = combinationAlphabets(arr,arr.length);
        return combination;
    }

    private static int combinationAlphabets(int[] a, int n) {
        int [] dp = new int [n+1];
        dp[0] = 0;

        for(int i=1; i<=n; i++) {
            if(i>1 && a[i-2] <= 2 && a[i-1] <= 6) {
                dp[i] = dp[i-1] + dp[i-2] + 1;
            } else {
                dp[i] = dp[i-1];
            }
        }
        return dp[n]+1;
    }

    public static void main(String args[]) {
        System.out.println(combinationAlphabets(101));
    }
}
