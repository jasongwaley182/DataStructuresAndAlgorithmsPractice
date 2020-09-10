package algorithms;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit Test for BinarySearch class.
 * @author Jason Gwaley
 */

public class BinarySearchTest {

    BinarySearch sut = new BinarySearch();
    int[] sortedArray = { 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16 };

    @Test
    public void BinarySearchReturnIndexLowerBound(){
        assertEquals(3, sut.search(sortedArray, 4));
    }

    @Test
    public void BinarySearchReturnIndexUpperBound(){
        assertEquals(12, sut.search(sortedArray, 13));
    }

}
