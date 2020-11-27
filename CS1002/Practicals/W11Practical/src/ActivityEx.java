public class ActivityEx {
    protected String name;
    protected String description;
    protected double cost;
    protected int capacity;
    protected int signUps = 0;
    protected DestinationEx dest;

    public ActivityEx(String name, double cost, int capacity, DestinationEx dest) {
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

    public DestinationEx getDest() {
        return dest;
    }

    public void setDest(DestinationEx dest) {
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
