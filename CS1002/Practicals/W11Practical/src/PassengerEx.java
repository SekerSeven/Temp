public class PassengerEx {
    protected String name;
    protected int number;
    protected static int nextNumber = 0;
    protected ActivityEx[] bookedActivities;
    protected int memory;
    protected CruiseEx[] cruiseList;
    protected ActivityEx[][] activityList;

    public PassengerEx(String name, int memory) {
        this.name = name;
        this.number = ++nextNumber;
        this.memory = memory;
        cruiseList = new CruiseEx[memory];
        activityList = new ActivityEx[memory][memory];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public ActivityEx[] getBookedActivities() {
        return bookedActivities;
    }

    public void setBookedActivities(ActivityEx[] bookedActivities) {
        this.bookedActivities = bookedActivities;
    }

    public void setListSize(CruiseEx cruise) {
        bookedActivities = new ActivityEx[cruise.getDestNum()];
    }

    public void bookActivity(ActivityEx act, CruiseEx cruise) {
        if (act.getCapacity() < act.getSignUps()) {
            for (int i = 0; i < cruise.getDestNum(); i++) {
                if (bookedActivities[i] == null) {
                    act.setSignUps(act.getSignUps() + 1);
                    bookedActivities[i] = act;
                    break;
                } else if (act.getDest() == bookedActivities[i].getDest()) {
                    System.out.println("You've already booked an activity in this location.");
                    break;
                }
            }
        } else {
            System.out.println("This activity is full so you cannot book it.");
        }
    }

    public void printBooking() {
        System.out.println("Name: " + getName());
        System.out.println("Number: " + getNumber());
    }

    public void printDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Number: " + getNumber());
        System.out.println("Activities:");
        for (int i = 0; i < bookedActivities.length; i++) {
            if (bookedActivities[i] != null) {
                bookedActivities[i].printBooking();
            }
        }
    }

    private int count3 = 0;

    public void storeCruise(CruiseEx cruise) {
        cruiseList[count3] = cruise;
        activityList[count3] = bookedActivities;
        count3++;
    }

    // This method prints the history of the passengers cruises including the
    // destinations they visited and the activities they did there
    public void printHistory() {
        for (int i = 0; i < memory; i++) {
            if (cruiseList[i] != null) {
                System.out.println("Ship name: " + cruiseList[i].getName());
                System.out.println("Capacity: " + cruiseList[i].getCapacity());
                System.out.println("Destination list: ");
                for (int j = 0; j < cruiseList[i].getDestNum(); j++) {
                    System.out.println("Name: " + cruiseList[i].getDestination(j).getName());
                }
                System.out.println("Activities:");
                for (int j = 0; j < activityList[i].length; j++) {
                    if (bookedActivities[i] != null) {
                        bookedActivities[i].printBooking();
                    }
                }
            }
        }

    }
}
