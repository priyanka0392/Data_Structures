package Array;

import java.util.PriorityQueue;

public class PowerArray {
    public static int[] sortedPowerArray(int arr[]) {
        int temp[] = new int[arr.length];
        PriorityQueue<Integer> p = new PriorityQueue<>();
        for (int i=0 ; i<arr.length ; i++) {
            int multiply = (int) Math.pow(arr[i],2);
            p.add(multiply);
        }
        // create arr1
        Integer[] arr1 = new Integer[arr.length];

        // use toArrsy() method
        Integer[] arr2 = p.toArray(arr1);
        for ( int i = 0; i<arr2.length; i++ ) {
            temp[i] = arr2[i];
        }
        for ( int i = 0; i<arr2.length; i++ ) {
            System.out.println(temp[i]);
        }
        return temp;
    }

    public static void main(String args[]) {
        int a[] = {-3,-2,0,2,5,6};
        sortedPowerArray(a);
    }
}
