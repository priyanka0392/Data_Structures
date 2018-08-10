package LeetCode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public static List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

        for(int i=0; i<nums.length ;i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i],map.get(nums[i])+1);

            else map.put(nums[i],1);
        }

        List<Integer> list = new ArrayList<Integer>();

        while(list.size()<k) {
            list = topKFreq(map,list);
        }
        return list;
    }

    public static List<Integer> topKFreq(HashMap<Integer,Integer> map, List list) {
        int max = Integer.MIN_VALUE;
        for(Map.Entry m : map.entrySet()) {
            if((int)m.getValue()>max)
                max = (int)m.getValue();
        }

        for(Map.Entry m : map.entrySet()) {
            if(max == (int)m.getValue()) {
                list.add(m.getKey());
                map.remove(m.getKey());
                break;
            }
        }


        return list;
    }

    public static void main(String args[]) {
        int nums[] = {5,3,1,1,1,3,73,1};
        System.out.println(topKFrequent(nums,2));
    }
}
