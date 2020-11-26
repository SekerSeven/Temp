public class ShowEx extends ActivityEx {
    private String[] starList;

    public ShowEx(String name, String description, double cost, int capacity, DestinationEx dest, String[] starList) {
        super(name, cost, capacity, dest);
        description = "theatre show";
        this.starList = starList;
    }

    public String[] getStarList() {
        return starList;
    }

    public void setStarList(String[] starList) {
        this.starList = starList;
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Actors: " + getStarList());
    }
}
