package LeetCode;

public class MaxSkyline {
    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        if(grid == null || grid.length == 0)
            return -1;

        int top[] = new int[grid.length];
        int left[] = new int[grid[0].length];

        int max = 0;

        for(int i=0;i<grid.length;i++) {
            for(int j=0;j<grid[0].length;j++) {
                if(grid[i][j] > max)
                    max = grid[i][j];
            }
            left[i] = max;
            max = 0;
        }

        for(int j=0;j<grid[0].length;j++) {
            for(int i=0;i<grid.length;i++) {
                if(grid[i][j] > max)
                    max = grid[i][j];
            }
            top[j] = max;
            max = 0;
        }

        int min = 0, diff = 0;
        for(int i=0 ; i<grid.length ; i++) {
            for(int j=0 ; j<grid[0].length ; j++) {
                if(left[i] < top[j])
                    min = left[i];
                else min = top[j];

                diff = diff + (min - grid[i][j]);
                grid[i][j] = min;
            }

        }
        return diff;
    }

    public static void main(String args[]) {
        int grid[][] = {{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}};
        System.out.println(maxIncreaseKeepingSkyline(grid));
    }
}
