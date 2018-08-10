package LeetCode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Triangle {
    public static int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0)
            return 0;

        int min;
        int res = 0;
        for (List<Integer> l : triangle) {
            min = Integer.MAX_VALUE;
            for (Integer i : l) {
                min = Math.min(i, min);
                System.out.println(min);
            }
            res = res + min;
        }
        return res;
    }

    public static int minimumTotal1(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size()+1];
        for(int i=triangle.size()-1;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                A[j] = Math.min(A[j],A[j+1])+triangle.get(i).get(j);
                System.out.println(A[j]);
            }
        }
        return A[0];
    }

    public static void main(String args[]) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> list = new LinkedList<>();
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
       // List<Integer> list3 = new LinkedList<>();

        list.add(-1);
        list1.add(2);
        list1.add(3);
        list2.add(1);
        list2.add(-1);
        list2.add(-3);
//        list3.add(4);
//        list3.add(1);
//        list3.add(8);
//        list3.add(3);

        triangle.add(list);
        triangle.add(list1);
        triangle.add(list2);
        //triangle.add(list3);

        System.out.println(minimumTotal(triangle));
    }

}

