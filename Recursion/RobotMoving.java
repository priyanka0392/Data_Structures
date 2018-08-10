package Recursion;

public class RobotMoving {

    public static int move(int x,int y) {
        if(x == 0 || y==0)
            return 1;

        else return move(x-1,y) + move(x,y-1);
    }

    public static void main(String args[]) {
        System.out.println(move(3,3));
    }
}
