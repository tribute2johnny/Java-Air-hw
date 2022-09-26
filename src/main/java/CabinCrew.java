public class CabinCrew {

    private String name;

    private Rank rank;

    public CabinCrew(String name, Rank rank) {
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return name;
    }

    public Rank getRank() {
        return rank;
    }

    public String relayMessage() {
        return "Buckle up... Buckaroos!";
    }
}
