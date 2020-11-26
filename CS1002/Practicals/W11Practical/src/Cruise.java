public class Cruise {
    private String name;
    private int capacity;
    private int passNum;
    private int destNum;
    private Destination[] itinerary;
    private Passenger[] passList;

    public Cruise(int capacity, int destNum) {
        this.capacity = capacity;
        this.destNum = destNum;
        itinerary = new Destination[destNum];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPassNum() {
        return passNum;
    }

    public void setPassNum(int passNum) {
        this.passNum = passNum;
    }

    public int getDestNum() {
        return destNum;
    }

    public void setDestNum(int destNum) {
        this.destNum = destNum;
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

    public void setPassListSize() {
        if (passNum <= capacity) {
            passList = new Passenger[passNum];
        }
    }

    public void setPassList(int pos, Passenger passenger) {
        this.passList[pos] = passenger;
    }

    public void printItinerary() {
        System.out.println("Ship name: " + getName());
        System.out.println("Destination list: ");
        for (int i = 0; i < getDestNum(); i++) {
            System.out.println("Name: " + itinerary[i].getName());
            System.out.println("Activities:");
            for (int j = 0; j < itinerary[i].getActList().length; j++) {
                itinerary[i].getActivity(j).printDetails();
            }
        }
    }

    public void printPassList() {
        System.out.println("Ship name: " + getName());
        System.out.println("Capacity: " + getCapacity());
        System.out.println("Number of passengers: " + getPassNum());
        System.out.println("Passengers:");
        for (int i = 0; i < getPassNum(); i++) {
            passList[i].printBooking();
        }
    }

    public void printRemaining() {
        for (int i = 0; i < getDestNum(); i++) {
            for (int j = 0; j < itinerary[i].getActList().length; j++) {
                if (itinerary[i].getActivity(j).getSignUps() < itinerary[i].getActivity(j).getCapacity()) {
                    itinerary[i].getActivity(j).printDetails();
                    System.out.println("Spaces remaining: "
                            + (itinerary[i].getActivity(j).getCapacity() - itinerary[i].getActivity(j).getSignUps()));
                }
            }
        }
    }
}
