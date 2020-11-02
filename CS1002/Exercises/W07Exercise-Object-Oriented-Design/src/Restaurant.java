public class Restaurant {
    private String name;
    private String address;
    private int starRating;
    private Dish dish1;
    private Dish dish2;
    public static final int BASE_RATING = 3;
    private int restNum;
    private static int counter = 0;

    public Restaurant(String name, int starRating) {
        this.name = name;
        this.starRating = starRating;
        this.restNum = ++counter;
    }

    public Restaurant(String name) {
        this(name, BASE_RATING);
    }

    public int getRestNum() {
        return restNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName() {
        this.name = "Unknown name";
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getStarRating() {
        return starRating;
    }

    public void setStarRating(int starRating) {
        // only allow stars to be between 0 and 5
        if (starRating >= 0 && starRating <= 5) {
            this.starRating = starRating;
        }
    }

    public void setStarRating() {
        this.starRating = BASE_RATING;
    }

    public Dish getDish1() {
        return dish1;
    }

    public void setDish1(Dish dish1) {
        this.dish1 = dish1;
    }

    public Dish getDish2() {
        return dish2;
    }

    public void setDish2(Dish dish2) {
        this.dish2 = dish2;
    }

    public void incrementStarRating() {
        // let the logic in setStarRating stop stars being more than 5
        setStarRating(starRating + 1);
    }

    public void decrementStarRating() {
        // let the logic in setStarRating stop stars being less than 0
        setStarRating(starRating - 1);
    }

    public void print() {
        System.out.println(name);
        System.out.println(address);
        System.out.println(starRating + " out of 5 stars");
        System.out.println("Restaurant number: " + getRestNum());
        // print the first dish if there is one
        System.out.print("Dish1: ");
        if (dish1 != null) {
            dish1.print();
        } else {
            System.out.println("N/A");
        }
        // print the second dish if there is one
        System.out.print("Dish2: ");
        if (dish2 != null) {
            dish2.print();
        } else {
            System.out.println("N/A");
        }
    }

}
