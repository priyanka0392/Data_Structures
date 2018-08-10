package Recursion;

public class MagicIndex {

    public  int findMagicIndex(int a[]) {

        return findMagicIndex(a,0,a.length);
    }

    public  int findMagicIndex(int a[], int start, int last) {

        int mid = (start + last) / 2;
        if(start <= last) {
            if (a[mid] == mid) {
                return mid;
            }
           else if (a[mid] > mid) {
               return findMagicIndex(a, start, mid - 1);
            }
            else {
              return findMagicIndex(a, mid+1, last);
            }
        }
        return -1;
    }

    int binarySearch(int arr[], int low, int high)
    {
        if(high >= low)
        {
            /* low + (high - low)/2; */
            int mid = (low + high)/2;
            if(mid == arr[mid])
                return mid;
            if(mid > arr[mid])
                return binarySearch(arr, (mid + 1), high);
            else
                return binarySearch(arr, low, (mid -1));
        }

        /* Return -1 if there is
           no Fixed Point */
        return -1;
    }
    public static void main(String args[]) {
        int a[] = {-10, -1, 0, 3, 10, 11, 30, 50, 100};
        MagicIndex m = new MagicIndex();
        System.out.println(m.findMagicIndex(a));
    }
}
