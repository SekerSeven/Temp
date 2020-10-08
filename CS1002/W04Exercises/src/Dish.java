public class Dish {
    String name;
    double price;
    boolean isVegetarian;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setVegetarian(boolean isVegetarian) {
        this.isVegetarian = isVegetarian;
    }

    public void print() {
        System.out.println("     " + name + ":\n          Price: " + price + "\n          Vegetarian: " + isVegetarian);
    }
}
