package thedailybyte;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Unit test for VacuumCleanerRoute Class.
 * @author Jason Gwaley
 */

public class VacuumCleanerRouteTest {

    VacuumCleanerRoute sut = new VacuumCleanerRoute();

    @Test
    public void VacuumCleanerRouteTestLR(){
        assertEquals(true, sut.willReturn("LR"));
    }

    @Test
    public void VacuumCleanerRouteTestURURD(){
        assertEquals(false, sut.willReturn("URURD"));
    }

    @Test
    public void VacuumCleanerRouteTestRUULLDRD(){
        assertEquals(true, sut.willReturn("RUULLDRD"));
    }
}
