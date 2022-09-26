import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    Passenger passenger;

    @Before
    public void before() {
        passenger = new Passenger("Albert Wesker", 2);
    }

    @Test
    public void passengerHasName() {
        assertEquals("Albert Wesker", passenger.getName());
    }

    @Test
    public void passengerHasNumOfBags() {
        assertEquals(2, passenger.getNumOfBags());
    }
}
