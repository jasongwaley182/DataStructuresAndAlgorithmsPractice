package algorithms.sorting;

/**
 * Given an unsorted array of integers, sort the array using the bubble sort algorithm.
 * O(N^2)
 * @author Jason Gwaley
 */

public class BubbleSort {

    public int[] sort(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(arr[i] < arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }
}
