public class CruiseEx {
    private String name;
    private int capacity;
    private int passNum;
    private int destNum;
    private int cabinNum;
    private int preCabinNum;
    private DestinationEx[] itinerary;
    private PassengerEx[] passList;
    private Cabin[] cabinList;

    public CruiseEx(int capacity, int destNum, int cabinNum, int preCabinNum) {
        this.capacity = capacity;
        this.destNum = destNum;
        this.cabinNum = cabinNum;
        this.preCabinNum = preCabinNum;
        itinerary = new DestinationEx[destNum];
        cabinList = new Cabin[cabinNum];
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

    public DestinationEx[] getItinerary() {
        return itinerary;
    }

    public DestinationEx getDestination(int num) {
        return itinerary[num];
    }

    public void setItinerary(int pos, DestinationEx destination) {
        this.itinerary[pos] = destination;
    }

    public PassengerEx[] getPassList() {
        return passList;
    }

    public void setPassListSize() {
        if (passNum <= capacity) {
            passList = new PassengerEx[passNum];
        }
    }

    public void setPassList(int pos, PassengerEx passenger) {
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

    public void printCabinAllocation() {
        for (int i = 0; i < cabinNum; i++) {
            System.out.println("Cabin name: " + cabinList[i].getName());
            if (cabinList[i].getOccupied()) {
                System.out.println("Occupant name: " + cabinList[i].getPassenger().getName());
                System.out.println("Occupant number: " + cabinList[i].getPassenger().getNumber());
            } else {
                System.out.println("Unoccupied");
            }
        }
    }
}
