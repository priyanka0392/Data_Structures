package LeetCode;

public class LargestMountain {
    public static int longestMountain(int[] A) {
        int n = A.length;
        int down[] = new int[A.length];
        int up[] = new int[A.length];
        int count = 0;
        for(int i=n-2; i>0;i--) {
            if(A[i]>A[i+1])
                down[i] = down[i+1]+1;
        }
        count=0;
        int res = 0;
        for(int i=0;i<n;i++) {
            if(i>0 && A[i]>A[i-1])
                up[i] = up[i-1]+1;
            if(up[i]>0 && down[i]>0)
                res = Math.max(res,up[i]+down[i]+1);
        }
        return res;
    }

    public static void main(String args[]) {
        int a[] ={2,1,4,7,3,2,5};
        longestMountain(a);
    }
}
