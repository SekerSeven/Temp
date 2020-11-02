public class Dish {
    private String name;
    private double price;
    private final boolean isVegetarian;

    public Dish(String name, double price, boolean isVegetarian) {
        this.name = name;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isVegetarian() {
        return isVegetarian;
    }

    // This method no longer works because the isVegetarian field is immutable.
    // public void setVegetarian(boolean isVegetarian) {
    // this.isVegetarian = isVegetarian;
    // }

    public void print() {
        System.out.print(name);
        System.out.printf(" £%.2f", price);
        if (isVegetarian) {
            System.out.println(" (v)");
        } else {
            System.out.println();
        }
    }
}