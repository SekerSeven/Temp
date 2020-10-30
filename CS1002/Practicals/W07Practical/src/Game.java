import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Game {
    String name;
    int loanLen;
    double price;
    Hall hall = new Hall();
    LocalDate dueDate;
    LocalDate loanDate;
    Student student1 = new Student();
    Student student2 = new Student();

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public int getLoanLen() {
        return loanLen;
    }

    public void setLoanLen(int newLoanLen) {
        loanLen = newLoanLen;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        price = newPrice;
    }

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall newHall) {
        hall = newHall;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate date) {
        loanDate = date;
    }

    public Student getStudent1() {
        return student1;
    }

    public void setStudent1(Student newStudent1) {
        student1 = newStudent1;
    }

    public Student getStudent2() {
        return student2;
    }

    public void setStudent2(Student newStudent2) {
        student2 = newStudent2;
    }

    // This method calculates the due date of a borrowed game so long as it has been
    // borrowed.
    public LocalDate calcDueDate(Game game) {
        if (game.loanDate == null) {
            return null;
        } else {
            return game.loanDate.plusDays(game.loanLen);
        }
    }

    // This method calculates the fine for the late return of the game based on the
    // halls per-day rate, with a cap at the price of replacement of the game.
    public double calcFine(Game game) {
        if (calcDueDate(game) == null || hall.fine * ChronoUnit.DAYS.between(calcDueDate(game), LocalDate.now()) < 0) {
            return 0;
        } else if (hall.fine * ChronoUnit.DAYS.between(calcDueDate(game), LocalDate.now()) < price) {
            return hall.fine * ChronoUnit.DAYS.between(calcDueDate(game), LocalDate.now());
        } else {
            return price;
        }
    }

    // This method outputs the details of the game including the names of the
    // students that have borrowed it and its due date, if applicable.
    public void getDetails(Game game) {
        System.out.println("Name: " + name);
        System.out.println("Replacement cost: " + price);
        System.out.println("Max loan length: " + loanLen);
        System.out.println("Hall: " + hall.name);
        if (student1 != null && student2 != null && calcDueDate(game) != null) {
            System.out.println("Borrowed by: " + student1.name + " and " + student2.name);
            System.out.println("Due date: " + calcDueDate(game));
        } else {
            System.out.println(name + " is not currently being borrowed.");
        }
    }
}
