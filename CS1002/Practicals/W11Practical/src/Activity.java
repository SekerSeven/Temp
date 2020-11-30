public class Activity {
    protected String name;
    protected String description;
    protected double cost;
    protected int capacity;
    protected int signUps = 0;
    protected Destination dest;

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

    // Prints the details of the activity. It is used in the print itinerary method
    // in the cruise class
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Cost: £" + getCost());
        System.out.println("Capacity: " + getCapacity());
    }

    // Prints the booking details of the activity. It is used in the print details
    // method in the passenger class
    public void printBooking() {
        System.out.println("Name: " + getName());
        System.out.println("Destination: " + getDest().getName());
        System.out.println("Price: £" + getCost());
    }
}
