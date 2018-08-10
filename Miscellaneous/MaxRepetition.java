package Miscellaneous;

public class MaxRepetition {
    public static int getMaxRepetition(int[] a) {
        int k = a.length;
    for(int i=0 ; i<k-1 ; i++) {
        a[a[i]%k] = a[a[i]%k] + k;
    }

    int max = a[0], index = 0;
    for(int i=0 ; i<k ; i++) {
        if(a[i] > max) {
            max = a[i];
            index = i;
        }
    }

    return index;
    }

    public static void main(String args[]) {
    int[] a = {2, 13, 13, 5, 13, 4, 1, 7};
    getMaxRepetition(a);
    }
}
