package Recursion;

public class RepresentNCents {

    public static int countCents(int n, int denom) {
        int nextDenom = 0;
        if (denom == 25) {
            nextDenom = 10;
        } else if (denom == 10) {
            nextDenom = 5;
        } else if (denom == 5) {
            nextDenom = 1;
        } else if (denom == 1) {
            return 1;
        }

        int ways = 0;
        for (int i = 1; i * denom <= n; i++) {
            ways += countCents(n - (i * denom), nextDenom);
        }
        return ways;

    }

    public static void main(String args[]) {
        System.out.println(countCents(100,25));
    }
}
