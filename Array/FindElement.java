package Array;

import static java.util.Arrays.binarySearch;
import static java.util.Arrays.sort;

public class FindElement {

    static int findPos(int arr[], int key) {
        int low = 0 ;
        int high = 1;
        int value = arr[high];

        while(value < key) {
            low = high;
            high = 2*high;
            value = arr[high];
        }
        return binarySearch(arr,low,high,key);
    }
     public static void main(String args[]) {
        int arr[] = {3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int pos = findPos(arr,90);
         System.out.println(pos);;
     }
}
