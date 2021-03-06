public class Standard extends Passenger {
    private double balance;

    public Standard(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // This method is overridden to increase the number of conditions that must be
    // met for this type of passenger to be able to sign up
    @Override
    public void bookActivity(Activity act, Cruise cruise) {
        int count2 = 0;
        if (act.getCapacity() > act.getSignUps()) {
            if (balance >= act.getCost()) {
                for (int i = 0; i < cruise.getDestNum(); i++) {
                    if (bookedActivities[i] == null || act.getDest() != bookedActivities[i].getDest()) {
                        count2++;
                    } else {
                        System.out.println("You've already booked an activity in this location.");
                        break;
                    }
                }
                if (count2 == cruise.getDestNum()) {
                    act.setSignUps(act.getSignUps() + 1);
                    bookedActivities[count] = act;
                    balance -= act.getCost();
                    count++;
                }
            } else {
                System.out.println("You have insufficient funds to book this activity.");
            }
        } else {
            System.out.println("This activity is full so you cannot book it.");
        }
    }
}
