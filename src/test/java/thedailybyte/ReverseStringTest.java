package thedailybyte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for Reverse String class.
 * @author Jason Gwaley
 */

public class ReverseStringTest {

    ReverseString sut = new ReverseString();

    @Test
    public void ReverseStringTestCat(){
        assertEquals("taC", sut.reverseString("Cat"));
    }

    @Test
    public void ReverseStringTestNeedMoreCoffee(){
        assertEquals("eeffoCeroMdeeN", sut.reverseString("NeedMoreCoffee"));
    }

    @Test
    public void ReverseStringTestItIsTooEarlyToProgram(){
        assertEquals("margorPoTylraEooTsItI", sut.reverseString("ItIsTooEarlyToProgram"));
    }
}