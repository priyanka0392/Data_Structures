package Miscellaneous;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayRotationGame {
    List<Integer> index = new ArrayList<>();
    public  List rotate(List<Integer> a, List<Integer> rotate) {
        a.remove(0);
        rotate.remove(0);
        List<Integer> index = new ArrayList<>();
        for(Integer i : rotate) {
            index = rotate(new ArrayList<>(a), i);
        }

        return index;
    }

    public  List rotate(List<Integer> a,int i) {
         Collections.rotate(a,-i);

         int max = a.get(0);
         int ind = 0;
         for(int j=0;j<a.size();j++) {
             if(a.get(j)>max) {
                 max = a.get(j);
                 ind=j;
             }

         }
         index.add(ind);
        return index;
    }
    public static void main(String args[]) {
        ArrayRotationGame n = new ArrayRotationGame();
        List<Integer> a = new ArrayList<>();
        List<Integer> rotate = new ArrayList<>();
        a.add(4);
        a.add(1);
        a.add(2);
        a.add(4);
        a.add(3);
        rotate.add(2);
        rotate.add(0);
        rotate.add(2);
        n.rotate(a,rotate);
    }
}
