public class Student {
    int matNumber;
    String name;
    Hall hall = new Hall();

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

    public Hall getHall() {
        return hall;
    }

    public void setHall(Hall newHall) {
        hall = newHall;
    }

    // This method outputs the student's details
    public void getDetails() {
        System.out.println("Name: " + name);
        System.out.println("Matriculation number: " + matNumber);
        System.out.println("Hall of Residence: " + hall.name);
    }
}
