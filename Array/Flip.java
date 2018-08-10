package Array;

public class Flip {

    public static void reverseColumnsInPlace(int[][] matrix){
        for(int col = 0;col < matrix[0].length; col++){
            for(int row = 0; row < matrix.length/2; row++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[matrix.length - row - 1][col];
                matrix[matrix.length - row - 1][col] = temp;
            }
        }
    }

    public static void flipHorizontalAxis(int[][] matrix) {

        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        for(int col = 0;col < matrix[0].length; col++){
            for(int row = 0; row < matrix.length/2; row++) {
                int temp = matrix[row][col];
                matrix[row][col] = matrix[matrix.length - row - 1][col];
                matrix[matrix.length - row - 1][col] = temp;
            }
        }

        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int A[][] = {{1,1},{0,0}};
        flipHorizontalAxis(A);
    }
}
