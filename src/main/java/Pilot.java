public class Pilot {

    private String name;
    private Rank rank;
    private String LicenseNumber;

    public Pilot(String name, Rank rank, String licenseNumber) {
        this.name = name;
        this.rank = rank;
        LicenseNumber = licenseNumber;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public String flyPlane(){
        return "5.. 4.. 3.. 2.. 1.. Lift Off!";
    }
}
