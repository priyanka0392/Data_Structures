package Recursion;

public class PowerOfThree {
    public static boolean isPowerOfThree(int n) {
        double pow = Math.log(n)/Math.log(4);
        System.out.println(pow);
        return pow == (int)pow;
    }

    public static void main(String args[]) {
        System.out.println(isPowerOfThree(45));
    }
}
