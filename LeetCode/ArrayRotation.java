package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*Given an array, rotate the array to the right by k steps, where k is non-negative.*/
public class ArrayRotation {
    public static int maxRotateFunction(int[] a) {
        List l = new ArrayList<Integer>();
        int sum = 0;

        l = Arrays.asList(a);
        int b[] = new int[a.length];
        int i=0;
        while(i<a.length) {
            List<Integer> list = new ArrayList<>(l);
            Collections.rotate(list,i);
            for(int j=0; j<a.length;j++) {
                sum = sum + (j*list.get(j));
            }
            b[i] = sum;
            sum=0;
            i++;
        }
        int max=b[0];
        for(int j=0;j<b.length;j++) {
            System.out.println(b[j]);
            if(b[j]>max)
                max = b[j];
        }
        return max;
    }

    public static void main(String args[]) {
        int a[] = {4, 3, 2, 6};
        System.out.println(maxRotateFunction(a));
    }
}
