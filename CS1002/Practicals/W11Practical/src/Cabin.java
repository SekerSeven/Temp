public class Cabin {
    protected String name;
    protected boolean occupied = false;
    protected PassengerEx pass;

    public Cabin(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean getOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public PassengerEx getPassenger() {
        return pass;
    }

    public void setPassenger(PassengerEx pass) {
        this.pass = pass;
    }

    // This method allows the booking of a room
    public void bookCabin(PassengerEx pass) {
        if (!occupied) {
            occupied = true;
            this.pass = pass;
        } else {
            System.out.println("You cannot book this room because it is already occupied.");
        }
    }
}
