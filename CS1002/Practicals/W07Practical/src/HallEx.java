import java.time.LocalDate;

public class HallEx {
    String name;
    String address;
    double fine;
    double fineLimit;

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

    public double getFineLimit() {
        return fineLimit;
    }

    public void setFineLimit(double newFineLimit) {
        fineLimit = newFineLimit;
    }

    // This method has been modified to have a greater number of conditions before
    // the game can be borrowed. It now requires that the student be able to pay any
    // fine they incur and that they have not incurred too many in the past.
    public void borrowGame(GameEx game, StudentEx student1, StudentEx student2, String date) {
        if ((student1.hall == game.hall || student2.hall == game.hall)
                && (student1.fines < fineLimit && student2.fines < fineLimit)
                && (student1.account.balance >= game.price && student2.account.balance >= game.price)) {
            game.setStudent1(student1);
            game.setStudent2(student2);
            game.setLoanDate(LocalDate.parse(date));
        } else {
            System.out.println("You can't borrow this game");
        }
    }

    // This method has been modified to appropriately fine students for late return
    // of games and record any fines they incur.
    public void returnGame(GameEx game, StudentEx student1, StudentEx student2) {
        if (game.loanDate != null) {
            student1.fines += game.calcFine(game);
            student2.fines += game.calcFine(game);
            student1.account.balance -= game.calcFine(game);
            student2.account.balance -= game.calcFine(game);
            game.loanDate = null;
            game.student1 = null;
            game.student2 = null;
        }
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Per-day fine: £" + fine);
    }
}
