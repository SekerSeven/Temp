import java.util.Scanner;

public class Cruise {
    private String name;
    private static final int CAPACITY = 5;
    private static final int DEST_NUM = 3;
    private Destination[] itinerary = new Destination[DEST_NUM];
    private Passenger[] passList = new Passenger[CAPACITY];
    Scanner sc = new Scanner(System.in);

    public Cruise() {
        System.out.println("Please input the name of the cruise ship: ");
        setName(sc.nextLine());
        System.out.println("Please input the name of the ");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCAPACITY() {
        return CAPACITY;
    }

    public Destination[] getItinerary() {
        return itinerary;
    }

    public void setItinerary(int pos, Destination destination) {
        this.itinerary[pos] = destination;
    }

    public Passenger[] getPassList() {
        return passList;
    }

    public void setPassList(int pos, Passenger passenger) {
        this.passList[pos] = passenger;
    }
}
