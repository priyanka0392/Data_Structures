package Array;

public class MajorityElement {

    public static int majorityElement(int[] nums) {

        int count = 0;
        int majorityIndex = 0;

        for(int i=0; i<nums.length ; i++) {
            if(count == 0) {
                majorityIndex = i;
                count = 0;
            }

                if (nums[majorityIndex] == nums[i])
                    count++;

                else count--;

        }

        if(count >= nums.length/2)
            return nums[majorityIndex];

        System.out.println(nums[majorityIndex]);

        return nums[majorityIndex];
    }

    public static void main(String args[]) {
        int nums[] = {6,5,5};
        System.out.println(majorityElement(nums));
    }
}
