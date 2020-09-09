package leetcode.easy;

/**
 * Write a function to find the longest common prefix string amongst an array of strings.
 *
 * If there is no common prefix, return an empty string "".
 *
 * Example 1:
 *
 * Input: ["flower","flow","flight"]
 * Output: "fl"
 *
 * Example 2:
 *
 * Input: ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * Note:
 *
 * All given inputs are in lowercase letters a-z.
 * returns String
 * @author Jason Gwaley
 */

public class LongestCommonPrefix {

    public String findLongestCommonPrefix(String[] strs){

        if(strs.length == 0) return "";

        String startingPoint = strs[0];

        for(int i = 0; i < strs.length; i++){
            while(strs[i].indexOf(startingPoint) != 0) {
                startingPoint = startingPoint.substring(0, startingPoint.length() - 1);
                if (startingPoint.isEmpty()) return "";
            }

        }

        return startingPoint;

    }
}
