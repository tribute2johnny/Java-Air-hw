import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightTest {

    Flight flight;
    CabinCrew cabinCrew1;
    CabinCrew cabinCrew2;
    CabinCrew cabinCrew3;
    Pilot pilot1;
    Pilot pilot2;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;





    @Before
    public void before() {
        flight = new Flight(PlaneType.BOEING747, "F45673", "GLA", "EDI", "07:00");
        cabinCrew1 = new CabinCrew("Amos Burton", Rank.PURSER);
        cabinCrew2 = new CabinCrew("Naomi Nagata", Rank.FLIGHT_ATTENDANT);
        cabinCrew3 = new CabinCrew("Alex Kamal", Rank.FLIGHT_ATTENDANT);
        pilot1 = new Pilot("James Holden", Rank.CAPTAIN, "JH4567");
        pilot2 = new Pilot("Camina Drummer", Rank.FIRST_OFFICER, "CD3434");
        passenger1 = new Passenger("Yorinobu", 2);
        passenger2 = new Passenger("Jackie", 2);
        passenger3 = new Passenger("Melanie", 3);
        passenger4 = new Passenger("Deborah", 2);
        flight.addPilots(pilot1);
        flight.addPilots(pilot2);
        flight.addCabinCrew(cabinCrew1);
        flight.addCabinCrew(cabinCrew2);
        flight.addCabinCrew(cabinCrew3);


    }

    @Test
    public void hasPilots() {
        assertEquals(2, flight.getNumPilots());
    }

    @Test
    public void hasCabinCrew() {
        assertEquals(3, flight.getNumCabinCrew());
    }

    @Test
    public void hasNoPassengersAtStart() {
        assertEquals(0, flight.getNumPassengers());
    }

    @Test
    public void flightHasAPlane() {
        assertEquals(PlaneType.BOEING747, flight.getPlaneType());
    }

    @Test
    public void canReturnNumAvailableSeats() {
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        assertEquals(37,flight.getNumSeatsLeft());
    }

    @Test
    public void canBookPassengerIfSeatsLeft() {
        flight = new Flight(PlaneType.CESSNA, "CE45", "LAX", "TEX", "15:00");
        flight.addPassengers(passenger1);
        assertEquals("Booking confirmed", flight.checkCapacity());
    }

    @Test
    public void cannotBookOverCapacity() {
        flight = new Flight(PlaneType.CESSNA, "CE45", "LAX", "TEX", "15:00");
        flight.addPassengers(passenger1);
        flight.addPassengers(passenger2);
        flight.addPassengers(passenger3);
        flight.addPassengers(passenger4);
        assertEquals("sorry this flight is full", flight.checkCapacity());
    }

    @Test
    public void pilotCanFlyPlain() {
        assertEquals("5.. 4.. 3.. 2.. 1.. Lift Off!", pilot1.flyPlane());
    }

    @Test
    public void crewCanRelayMessages() {
        assertEquals("Buckle up... Buckaroos!", cabinCrew1.relayMessage());
    }
}
