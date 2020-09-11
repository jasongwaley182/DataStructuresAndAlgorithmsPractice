package algorithms.sorting;

/**
 * Given an unsorted array of integers, sort the array using the insertion sort algorithm.
 * O(N^2)
 * @author Jason Gwaley
 */

public class InsertionSort {

    public int[] sort(int[] nums){

        for(int i = 1; i < nums.length; i++){
            while(i > 0 && nums[i] < nums[i-1]){
                int temp = nums[i-1];
                nums[i-1] = nums[i];
                nums[i] = temp;
                i -= 1;

            }
        }

        return nums;
    }
}
