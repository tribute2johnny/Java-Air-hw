import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {

    Pilot pilot;

    @Before
    public void before() {
        pilot = new Pilot("James Holden", Rank.CAPTAIN, "55745");
    }

    @Test
    public void pilotHasName() {
        assertEquals("James Holden", pilot.getName());
    }

    @Test
    public void pilotHasRank() {
        assertEquals(Rank.CAPTAIN, pilot.getRank());
    }

    @Test
    public void pilotHasLicense() {
        assertEquals("55745", pilot.getLicenseNumber());
    }


}
