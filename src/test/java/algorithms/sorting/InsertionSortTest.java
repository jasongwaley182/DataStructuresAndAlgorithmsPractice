package algorithms.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit Test for InsertionSort class.
 * @author Jason Gwaley
 */

public class InsertionSortTest {

    InsertionSort sut = new InsertionSort();
    int[] unsortedArray = { 1, 5, 8, 4, 7, 9, 2, 3 };
    int[] sortedArray = { 1, 2, 3, 4, 5, 7, 8, 9 };

    @Test
    public void InsertionSortUnsortedArrayTest(){
        assertArrayEquals(sortedArray, sut.sort(unsortedArray));
    }
}
