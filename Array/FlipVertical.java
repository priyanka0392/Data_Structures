package Array;

public class FlipVertical {

    public static void reverseRows(int [][] matrix)
    {
        for (int i = 0 ; i < matrix.length ; i++) {       // for each row...
            int[] reversed = new int[matrix[i].length];   // ... create a temporary array that will hold the reversed inner one ...
            for(int j = 0 ; j < matrix[i].length ; j++) { // ... and for each column ...
                reversed[reversed.length - 1 - j] = matrix[i][j];
                //matrix[i][j] = reversed[reversed.length - 1 - j];

            }
            matrix[i] = reversed;
        }

        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void flipItVerticalAxis(int[][] matrix) {
        int temp = 0;
        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }

        for (int i=0 ; i< matrix.length-1; i++) {
            for (int j=0 ; j<matrix.length ; j++) {
                temp = matrix[i][j];
                matrix[i][j] = matrix[i+1][j];
                matrix[j][i+1] = temp;

            }
        }


        System.out.println();

        for (int i=0 ; i<matrix.length ; i++) {
            for (int j=0 ; j<matrix.length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int A[][] = {{1,0},{1,0}};
        reverseRows(A);
    }
}
