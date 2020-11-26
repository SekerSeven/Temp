public class AttractionEx extends ActivityEx {
    public AttractionEx(String name, double cost, int capacity, DestinationEx dest) {
        super(name, cost, capacity, dest);
        description = "visit to an attraction";
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        System.out.println("Capacity: " + getCapacity());
    }
}
