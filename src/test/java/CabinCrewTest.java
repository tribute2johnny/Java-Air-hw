import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CabinCrewTest {

    CabinCrew cabinCrew;

    @Before
    public void before() {
        cabinCrew = new CabinCrew("Claire Redfield", Rank.PURSER);
    }

    @Test
    public void crewHasName() {
        assertEquals("Claire Redfield", cabinCrew.getName());
    }

    @Test
    public void crewHasRank() {
        assertEquals(Rank.PURSER, cabinCrew.getRank());
    }
}
