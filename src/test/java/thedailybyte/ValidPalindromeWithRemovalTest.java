package thedailybyte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for ValidPalindromeWithRemoval class.
 * @author Jason Gwaley
 */

public class ValidPalindromeWithRemovalTest {

    ValidPalindromeWithRemoval sut = new ValidPalindromeWithRemoval();

    @Test
    public void validPalindromeWithRemovalTestABCBA(){
        assertEquals(true, sut.isPalindromeWithRemoval("abcba"));
    }

    @Test
    public void validPalindromeWithRemovalTestFOOBOF(){
        assertEquals(true, sut.isPalindromeWithRemoval("foobof"));
    }

    @Test
    public void validPalindromeWithRemovalTestABCCAB(){
        assertEquals(false, sut.isPalindromeWithRemoval("abccab"));
    }
}
