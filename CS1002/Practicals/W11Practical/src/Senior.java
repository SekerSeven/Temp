public class Senior extends Passenger {
    private double balance;

    public Senior(String name, double balance) {
        super(name);
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // This method is overridden in order to increase the conditions required for
    // this type of passenger to sign up
    @Override
    public void bookActivity(Activity act, Cruise cruise) {
        int count2 = 0;
        if (act.getCapacity() > act.getSignUps()) {
            if (balance >= act.getCost() * 0.9) {
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
                    balance -= act.getCost() * 0.9;
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
