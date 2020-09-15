package thedailybyte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit Test for JewelsAndStones class.
 * @author Jason Gwaley
 */

public class JewelsAndStonesTest {

    JewelsAndStones sut = new JewelsAndStones();

    @Test
    public void JewelsAndStonesABCAndAcTest(){
        assertEquals(2, sut.getNumOfStonesThatAreJewels("ac", "abc"));
    }

    @Test
    public void JewelsAndStonesAfAndAaaddfFfTest(){
        assertEquals(3, sut.getNumOfStonesThatAreJewels("AaaddfFf", "Af"));
    }

    @Test
    public void JewelsAndStonesAYOPDAndayopdTest(){
        assertEquals(0, sut.getNumOfStonesThatAreJewels("ayopd", "AYOPD"));
    }
}
