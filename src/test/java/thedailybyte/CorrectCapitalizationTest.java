package thedailybyte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for CorrectCapitalization class.
 * @author Jason Gwaley
 */

public class CorrectCapitalizationTest {

    CorrectCapitalization sut = new CorrectCapitalization();

    @Test
    public void isCapitalizationCorrectAllCaps(){
        assertEquals(true, sut.isCapitalizationCorrect("USA"));
    }

    @Test
    public void isCapitalizationCorrectFirstLetterCap(){
        assertEquals(true, sut.isCapitalizationCorrect("Calvin"));
    }

    @Test
    public void isCapitalizationCorrectCapInMiddleOfString(){
        assertEquals(false, sut.isCapitalizationCorrect("compUter"));
    }

    @Test
    public void isCapitalizationCorrectNoCaps(){
        assertEquals(true, sut.isCapitalizationCorrect("coding"));
    }
}
