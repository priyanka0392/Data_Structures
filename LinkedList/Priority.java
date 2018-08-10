package LinkedList;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority {

    public static void printPriorityQueue(int nums[], int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>(k, new Comparator<Integer>(){

                    @Override
                    public int compare(Integer o1, Integer o2) {
                        if(o1<o2)
                            return o1;
                        else if(o2<o1) return o2;
                        else return 0;
                    }
                });

        for(int i=0 ; i<nums.length ; i++) {
            priorityQueue.add(nums[i]);
        }

        int result[] = new int[k];
        for(int i=0 ; i<k ; i++)
            result[i] = priorityQueue.poll();

        for (int i=0 ; i<k ; i++)
            System.out.println(result[i]);
    }

    public static int print(int nums[], int k) {
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1 < o2) {
                    return -1;
                } else if(o1 > o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        };
        PriorityQueue<Integer> minheap = new PriorityQueue<Integer>(k, comparator);

        for (int i : nums) {
            minheap.add(i);
        }

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = minheap.poll();
        }
        return result[k-1];
    }
    public static void main(String args[]) {
        int nums[] = {3,2,1,5,6,4};
        System.out.println(print(nums,2));
    }
}
