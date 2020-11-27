public class CabinPremium extends Cabin {

    public CabinPremium(String name, boolean occupied) {
        super(name, occupied);
    }

    public void bookCabin(PassengerEx pass) {
        if (!occupied) {
            if (pass instanceof PremiumEx) {
                occupied = true;
                this.pass = pass;
            } else {
                System.out.println("You cannot book this room because you are not a premium passenger.");
            }
        } else {
            System.out.println("You cannot book this room because it is already occupied.");
        }
    }
}
