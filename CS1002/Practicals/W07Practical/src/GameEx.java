import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class GameEx {
    String name;
    int loanLen;
    double price;
    HallEx hall = new HallEx();
    LocalDate dueDate;
    LocalDate loanDate;
    StudentEx student1 = new StudentEx();
    StudentEx student2 = new StudentEx();

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

    public HallEx getHall() {
        return hall;
    }

    public void setHall(HallEx newHall) {
        hall = newHall;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate date) {
        loanDate = date;
    }

    public StudentEx getStudent1() {
        return student1;
    }

    public void setStudent1(StudentEx newStudent1) {
        student1 = newStudent1;
    }

    public StudentEx getStudent2() {
        return student2;
    }

    public void setStudent2(StudentEx newStudent2) {
        student2 = newStudent2;
    }

    public LocalDate calcDueDate(GameEx game) {
        if (game.loanDate == null) {
            return null;
        } else {
            return game.loanDate.plusDays(game.loanLen);
        }
    }

    public double calcFine(GameEx game) {
        if (calcDueDate(game) == null || hall.fine * ChronoUnit.DAYS.between(calcDueDate(game), LocalDate.now()) < 0) {
            return 0;
        } else if (hall.fine * ChronoUnit.DAYS.between(calcDueDate(game), LocalDate.now()) < price) {
            return hall.fine * ChronoUnit.DAYS.between(calcDueDate(game), LocalDate.now());
        } else {
            return price;
        }
    }

    public void getDetails(GameEx game) {
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
