package leetcode.easy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for Single Number Class.
 * @author Jason Gwaley
 */

public class SingleNumberTest {

    SingleNumber sut = new SingleNumber();

    @Test
    public void singleNumberTestCheckFive(){
        assertEquals(5, sut.findSingleNumber(new int[]{1,1,2,3,2,3,4,6,4,6,5,7,7,8,9,8,9}));
    }

    @Test
    public void singleNumberTestCheckThree(){
        assertEquals(3, sut.findSingleNumber(new int[]{1,1,2,2,3,4,4}));
    }

    @Test
    public void singleNumberTestCheckOne(){
        assertEquals(1, sut.findSingleNumber(new int[]{0,0,1,2,2,3,3}));
    }
}
