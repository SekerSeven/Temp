public class Attraction extends Activity {

    public Attraction(String name, double cost, int capacity, Destination dest) {
        super(name, cost, capacity, dest);
        description = "visit to an attraction";
    }

    // The method is overridden to print the specific description for this subclass
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        System.out.println("Capacity: " + getCapacity());
    }
}
