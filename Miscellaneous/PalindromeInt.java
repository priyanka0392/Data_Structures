package Miscellaneous;

public class PalindromeInt {
    public static Boolean isIntPalindrome(int x) {
        if(x == 0)
            return true;
        if(Math.abs(x%10) <10 )
            return false;

        int tempOrig = x;
        int temp = 0;
        while (x != 0) {
            temp = x%10 + temp*10;
            x = x/10;
        }

        if(tempOrig == temp)
            return true;

        return false;

    }

    public static void main(String args[]) {
        System.out.println(isIntPalindrome(12321));
        System.out.println(1/10);
    }
}
