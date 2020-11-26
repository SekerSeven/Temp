public class Activity {
    private String name;
    protected String description;
    private double cost;
    private int capacity;
    private int signUps = 0;
    private Destination dest;

    public Activity(String name, double cost, int capacity, Destination dest) {
        this.name = name;
        this.cost = cost;
        this.capacity = capacity;
        this.dest = dest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSignUps() {
        return signUps;
    }

    public void setSignUps(int signUps) {
        this.signUps = signUps;
    }

    public Destination getDest() {
        return dest;
    }

    public void setDest(Destination dest) {
        this.dest = dest;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Cost: £" + getCost());
        System.out.println("Capacity: " + getCapacity());
    }

    public void printBooking() {
        System.out.println("Name: " + getName());
        System.out.println("Destination: " + getDest());
        System.out.println("Price: £" + getCost());
    }
}
