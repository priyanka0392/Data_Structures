package Recursion;

public class PaintFill {

    public static void fillPaint(char a[][],int x, int y) {

        if(x<0 || y<0 || x>a.length-1 || y>a[0].length-1)
            return;

        if(a[x][y] == 'N') {
            a[x][y] = 'Y';

            fillPaint(a,x+1,y);
            fillPaint(a,x,y+1);
            fillPaint(a,x-1,y);
            fillPaint(a,x,y-1);
        }

        for(int i=0; i <a.length ; i++) {
            for(int j=0 ; j<a[0].length ; j++)
                System.out.println(a[i][j]);
        }
    }

    public static void main(String args[]) {
        char a[][] = {{'N','N'},{'N','N'},{'N','N'}};
        fillPaint(a,0,0);
    }
}
