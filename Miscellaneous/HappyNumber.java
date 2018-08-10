package Miscellaneous;

import java.util.HashSet;

public class HappyNumber {

    public static boolean isHappyNumber(int n) {
        int temp;
        double tempStor = 0;
        HashSet<Integer> set = new HashSet<>();
     while (tempStor != 1) {
         temp = n%10;
        tempStor  = Math.pow(temp ,2) + tempStor;
        if(set.contains(tempStor))
            return false;
        set.add((int)tempStor);
         n = (int)tempStor;

     }

     return true;
    }

    public static void main(String args[]) {
        System.out.println(isHappyNumber(19));
    }
}
