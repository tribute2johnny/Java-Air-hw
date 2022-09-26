import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaneTest {

    Plane plane;

    @Before
    public void before() {
        plane = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void planeHasType() {
        assertEquals(PlaneType.BOEING747, plane.getPlaneType());
    }

    @Test
    public void planeHasCapacity() {
        assertEquals(40, PlaneType.BOEING747.getCapacity());
    }

    @Test
    public void planeHasTotalWeight() {
        assertEquals(20000, PlaneType.BOEING747.getTotalWeight());
    }
}
