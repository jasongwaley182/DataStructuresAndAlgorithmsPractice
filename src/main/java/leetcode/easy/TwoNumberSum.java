package leetcode.easy;

import java.util.HashMap;

public class TwoNumberSum {

    /**
     *
     * @param nums
     * @param target
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they
     * add up to the target. Each input will have exactly one solution.
     * @return int[]
     * @author Jason Gwaley
     */

    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i = 0; i < nums.length; i++){
            int comp = target - nums[i];
            if(map.containsKey(comp) && map.get(comp) != i){
                return new int[] { i, map.get(comp) };
            }
        }
        return new int[0];
    }
}
