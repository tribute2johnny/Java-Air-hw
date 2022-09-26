public enum PlaneType {

    BOEING747(40, 20000),
    AIRBUS_A320(50, 30000),
    BOEING777(30, 15000),
    CESSNA(3, 1000);

    private final int capacity;

    private final int totalWeight;

    PlaneType(int capacity, int totalWeight) {
        this.capacity = capacity;
        this.totalWeight = totalWeight;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalWeight() {
        return totalWeight;
    }
}
