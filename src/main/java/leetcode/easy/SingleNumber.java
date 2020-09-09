package leetcode.easy;

/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 *
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 *
 * Input: [2,2,1]
 * Output: 1
 * Example 2:
 *
 * Input: [4,1,2,1,2]
 * Output: 4
 */

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int findSingleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int index = 0;

        for(int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], 2);
            }
        }

        for(Map.Entry<Integer, Integer> set : map.entrySet()) {
            if(set.getValue() == 1){
                index = set.getKey();
            }
        }

        return index;

    }
}