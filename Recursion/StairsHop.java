package Recursion;

public class StairsHop {

    public static int stairsHop(int n) {
        if(n==0 || n==1)
            return 1;
        if(n==2)
            return 2;

        else return stairsHop(n-1)+stairsHop(n-2)+stairsHop(n-3);
    }

    public static void main(String args[]) {
        System.out.println(stairsHop(4));
    }
}
