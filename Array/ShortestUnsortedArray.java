package Array;

import java.util.Arrays;

public class ShortestUnsortedArray {

    public static int findUnsortedSubarray(int[] nums) {
        int[] snums = nums.clone();
        Arrays.sort(snums);
        int start = snums.length, end = 0;
        for (int i = 0; i < snums.length; i++) {
            if (snums[i] != nums[i]) {
                start = Math.min(start, i);
                end = Math.max(end, i);
            }
        }
        return (end - start >= 0 ? end - start + 1 : 0);

    }

    public static void main(String args[]) {
        int nums[] = {1,3,2,4,5};
        System.out.println(findUnsortedSubarray(nums));
    }
}
