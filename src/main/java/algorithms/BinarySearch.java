package algorithms;

/**
 * Given a sorted array and a number from the array, write a function that
 * can return the index of where the value lies in the array.
 * Implement the function using the binary search algorithm.
 * O(log n)
 * @author Jason Gwaley
 */

public class BinarySearch {

    public int search(int[] arr, int searchKey){

        int lowerBound = 0;
        int upperBound = arr.length - 1;
        int index = 0;

        while(lowerBound <= upperBound){
            int middle = (lowerBound + upperBound) / 2;

            if(arr[middle] == searchKey) {
                return middle;
            } else if(searchKey < arr[middle]){
                upperBound = middle - 1;
            } else if(searchKey > arr[middle]){
                lowerBound = middle + 1;
            } else if(arr[middle] == searchKey){
                index = middle;
            }

        }

        return index;
    }
}
