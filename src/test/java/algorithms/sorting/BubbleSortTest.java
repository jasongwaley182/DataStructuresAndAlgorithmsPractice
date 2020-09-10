package algorithms.sorting;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;

/**
 * Unit Test for BubbleSort class.
 * @author Jason Gwaley
 */

public class BubbleSortTest {

    BubbleSort sut = new BubbleSort();
    int[] unsortedArray = { 7,6,5,4,3,2 };
    int[] sortedArray = { 2,3,4,5,6,7 };

    @Test
    public void BubbleSortUnsortedArrayTest(){
        assertArrayEquals(sortedArray, sut.sort(unsortedArray));
    }
}
