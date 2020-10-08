public class Restaurant {
    String name;
    String address;
    int starRating;
    Dish dish1 = new Dish();
    Dish dish2 = new Dish();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setStarRating(int starRating) {
        this.starRating = starRating;
    }

    public int getStarRating() {
        return starRating;
    }

    public void incrementRating() {
        starRating++;
    }

    public void decrementRating() {
        starRating--;
    }

    public void setDish1(Dish newDish) {
        dish1 = newDish;
    }

    public void setDish2(Dish newDish) {
        dish2 = newDish;
    }

    public void print() {
        System.out.println(name + "\n" + address + "\n" + starRating + " stars\nMenu:");
        dish1.print();
        dish2.print();
    }
}