public class StandardEx extends PassengerEx {
    private double balance;

    public StandardEx(String name, int memory, double balance) {
        super(name, memory);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void bookActivity(ActivityEx act, CruiseEx cruise) {
        if (act.getCapacity() > act.getSignUps()) {
            if (balance >= act.getCost()) {
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
                System.out.println("You have insufficient funds to book this activity.");
            }
        } else {
            System.out.println("This activity is full so you cannot book it.");
        }
    }
}
