package algorithms.sorting;

/**
 * Given an unsorted array of integers, sort the array using the selection sort algorithm.
 * O(N^2)
 * @author Jason Gwaley
 */

public class SelectionSort {

    public int[] sort(int[] arr) {

        for(int i = 0; i < arr.length - 1; i++){
            int minimum = i;

            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[minimum]){
                    minimum = j;
                }
            }

            if(minimum != i){
                int temp = arr[i];
                arr[i] = arr[minimum];
                arr[minimum] = temp;
            }
        }

        return arr;
    }
}
