import java.util.ArrayList;

public class Flight {

    private ArrayList<Pilot> pilots;
    private ArrayList<CabinCrew> cabinCrew;
    private ArrayList<Passenger> passengers;
    private PlaneType planeType;
    private String flightNumber;
    private String destination;
    private String departureAirport;
    private String departureTime;

    private int numSeats;

    public Flight(PlaneType planeType, String flightNumber, String destination, String departureAirport, String departureTime) {
        this.pilots = new ArrayList<Pilot>();
        this.cabinCrew = new ArrayList<CabinCrew>();
        this.passengers = new ArrayList<Passenger>();
        this.planeType = planeType;
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
    }

    public ArrayList<Pilot> getPilots() {
        return pilots;
    }

    public ArrayList<CabinCrew> getCabinCrewMembers() {
        return cabinCrew;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureAirport() {
        return departureAirport;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public void addPilots(Pilot pilot) {
        this.pilots.add(pilot);
    }

    public int getNumPilots() {
        return this.pilots.size();
    }

    public int getNumCabinCrew() {
        return this.cabinCrew.size();
    }

    public void addCabinCrew(CabinCrew cabinCrew) {
        this.cabinCrew.add(cabinCrew);
    }

    public void addPassengers(Passenger passenger) {
        this.passengers.add(passenger);
    }

    public int getNumPassengers() {
        return this.passengers.size();
    }

    public int getNumSeatsLeft() {
        numSeats = planeType.getCapacity() - getNumPassengers();
        return numSeats;
    }

    public String checkCapacity() {
        if (planeType.getCapacity() < getNumPassengers()) {
            return "sorry this flight is full";

        }

        return "Booking confirmed";

    }
}