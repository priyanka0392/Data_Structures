package LinkedList;

import java.util.ArrayList;

public class SpiralMatrix {
    // k = start row index, m = end row index, p = start column index, n = end row index
    public static ArrayList<Integer> findSpiral(int[][] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int k = 0, l = 0;
        int m = arr.length, n = arr[0].length;
        int i = 0;
        while (k < m && l < n) {
            // Print the first row from the remaining rows
            for (i = l; i < n; ++i) {
                list.add(arr[k][i]);
            }
            k++;

            // Print the last column from the remaining columns
            for (i = k; i < m; ++i) {
                list.add(arr[i][n - 1]);
            }
            n--;

            // Print the last row from the remaining rows */
            if (k < m) {
                for (i = n - 1; i >= l; --i) {
                    list.add(arr[m - 1][i]);
                }
                m--;
            }

            // Print the first column from the remaining columns */
            if (l < n) {
                for (i = m - 1; i >= k; --i) {
                    list.add(arr[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}
