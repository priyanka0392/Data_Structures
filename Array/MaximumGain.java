package Array;

public class MaximumGain {
    public static int maxGain(int[] a) {
        int diff = -1;
        int min = a[0];
        int max = -1;
        for (int i=0 ; i<a.length ; i++) {
            if(a[i]<=min)
                min = a[i];

            max = a[i] - min;
                if(max >diff)
                    diff = max;
        }
        return diff;
    }

    public static void main(String args[]) {
        int a[] = {10,8,7,6,5};
        System.out.println(maxGain(a));
    }
}
