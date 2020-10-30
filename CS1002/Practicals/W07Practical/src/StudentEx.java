public class StudentEx {
    int matNumber;
    String name;
    HallEx hall = new HallEx();
    double fines;
    Account account = new Account();

    public int getMatNumber() {
        return matNumber;
    }

    public void setMatNumber(int newMatNumber) {
        matNumber = newMatNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public HallEx getHall() {
        return hall;
    }

    public void setHall(HallEx newHall) {
        hall = newHall;
    }

    public double getFines() {
        return fines;
    }

    public void setFines(double newFines) {
        fines = newFines;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account newAccount) {
        account = newAccount;
    }

    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Matriculation number: " + matNumber);
        System.out.println("Hall of Residence: " + hall.name);
        System.out.println("Total fined: " + fines);
    }
}
