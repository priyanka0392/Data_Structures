package Array;

import java.util.HashMap;
import java.util.Map;

public class CoupleSum {
    public static int[] coupleSum(int[] numbers, int target) {
        int index[] = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i=0 ; i<numbers.length ; i++) {
            map.put(numbers[i],i+1);
            if(map.containsKey(target-numbers[i])) {
                index[1] = map.get(numbers[i]);
                index[0] = map.get(target-numbers[i]);
                break;
            }
        }
        for (int i=0 ; i<index.length ; i++) {
            System.out.println(index[i]);
        }

        return index;
    }

    public static void main(String args[]) {
        int a[] = {2, 3, 4, 7};
        coupleSum(a,7);
    }
}
