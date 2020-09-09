package leetcode.easy;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for LongestCommonPrefix class.
 * @author Jason Gwaley
 */

public class LongestCommonPrefixTest {

    LongestCommonPrefix sut = new LongestCommonPrefix();

    @Test
    public void LongestCommonPrefixTestSe(){
        assertEquals("Se", sut.findLongestCommonPrefix(new String[]{ "Seth", "Seth00", "Se", "See" }));
    }

    @Test
    public void LongestCommonPrefixTestTe(){
        assertEquals("Te", sut.findLongestCommonPrefix(new String[]{ "Teeth", "Test", "Tea", "Tested" }));
    }

    @Test
    public void LongestCommonPrefixTestFl(){
        assertEquals("fl", sut.findLongestCommonPrefix(new String[]{ "flower", "flow", "flight" }));
    }

    @Test
    public void LongestCommonPrefixTestEmpty(){
        assertEquals("", sut.findLongestCommonPrefix(new String[]{ "dog","racecar","car" }));
    }
}
