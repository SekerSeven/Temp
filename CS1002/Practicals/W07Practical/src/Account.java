import java.time.LocalDate;

public class Account {
    int number;
    LocalDate dateCreated;
    double balance;

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        number = newNumber;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String newDateCreated) {
        dateCreated = LocalDate.parse(newDateCreated);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }

    public void getDetails() {
        System.out.println("Account number: " + number);
        System.out.println("Date created: " + dateCreated);
        System.out.println("Balance: " + balance);
    }
}
