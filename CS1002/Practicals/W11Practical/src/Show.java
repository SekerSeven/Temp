public class Show extends Activity {
    private int starNum;
    private String[] starList;

    public Show(String name, double cost, int capacity, Destination dest, int starNum) {
        super(name, cost, capacity, dest);
        description = "theatre show";
        starList = new String[starNum];
    }

    public String[] getStarList() {
        return starList;
    }

    public void setStar(int pos, String star) {
        starList[pos] = star;
    }

    public void setStarList(String[] starList) {
        this.starList = starList;
    }

    // This method is overridden to print of the details specific to this subclass
    @Override
    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Description: " + getDescription());
        System.out.println("Cost: " + getCost());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Actors: ");
        for (int i = 0; i < starNum; i++) {
            System.out.println(starList[i]);
        }
    }
}
