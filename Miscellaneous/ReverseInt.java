package Miscellaneous;

/**
 * Created by manishpurohit on 7/18/18.
 */
public class ReverseInt {

    public static int reverseInt(int num) {

       int temp = 0;

       while (num != 0) {
           temp = num%10 + temp*10;
           num = num/10;

       }

      return temp;
    }

    public static void main(String args[]) {
        System.out.println(reverseInt(Integer.MAX_VALUE));
        System.out.println(Integer.MAX_VALUE);
    }
}
