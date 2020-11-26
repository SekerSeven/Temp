public class Tour extends Activity {
    private double distance;

    public Tour(String name, String description, double cost, int capacity, Destination dest, double distance) {
        super(name, cost, capacity, dest);
        this.distance = distance;
        description = "walking tour";
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Distance: " + getDistance());
    }
}
