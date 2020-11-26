public class Passenger {
    protected String name;
    protected int number;
    protected int nextNumber = 0;
    protected Activity[] bookedActivities;

    public Passenger(String name) {
        this.name = name;
        this.number = ++nextNumber;
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

    public Activity[] getBookedActivities() {
        return bookedActivities;
    }

    public void setBookedActivities(Activity[] bookedActivities) {
        this.bookedActivities = bookedActivities;
    }

    public void setListSize(Cruise cruise) {
        bookedActivities = new Activity[cruise.getDestNum()];
    }

    protected int count = 0;

    public void bookActivity(Activity act, Cruise cruise) {
        int count2 = 0;
        if (act.getCapacity() < act.getSignUps()) {
            for (int i = 0; i < cruise.getDestNum(); i++) {
                if (act.getDest() != bookedActivities[i].getDest()) {
                    count2++;
                } else {
                    System.out.println("You've already booked an activity in this location.");
                    break;
                }
            }
            if (count2 == cruise.getDestNum()) {
                act.setSignUps(act.getSignUps() + 1);
                bookedActivities[count] = act;
                count++;
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
}
