package algorithms.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit Test for SelectionSort class.
 * @author Jason Gwaley
 */

public class SelectionSortTest {

    SelectionSort sut = new SelectionSort();
    int[] unsortedArray = { 7,6,5,4,3,2 };
    int[] sortedArray = { 2,3,4,5,6,7 };

    @Test
    public void SelectionSortUnsortedArrayTest(){
        assertArrayEquals(sortedArray, sut.sort(unsortedArray));
    }
}