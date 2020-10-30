import java.time.LocalDate;

public class Hall {
    String name;
    String address;
    double fine;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String newAddress) {
        address = newAddress;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double newFine) {
        fine = newFine;
    }

    // This method sets the attributes of the game to reflect that it has been
    // borrowed so long as one of the students borrowing it is from the same hall as
    // the game.
    public void borrowGame(Game game, Student student1, Student student2, String date) {
        if (student1.hall == game.hall || student2.hall == game.hall) {
            game.setStudent1(student1);
            game.setStudent2(student2);
            game.setLoanDate(LocalDate.parse(date));
        } else {
            System.out.println("You can't borrow this game");
        }
    }

    // This method sets the attributes of the game to reflect the fact that it has
    // been returned.
    public void returnGame(Game game) {
        if (game.loanDate != null) {
            game.student1 = null;
            game.student2 = null;
            game.dueDate = null;
        }
    }

    // This method oututs the details of the hall.
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Per-day fine: £" + fine);
    }
}
