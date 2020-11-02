public class W04Exercise {
    public static void main(String[] args) throws Exception {
        // creating 2 restaurants as test data
        System.out.println("--- Printing Restaurant details ---");
        // • Create an object for restaurant BayLeaf and assign suitable values for all
        // attributes.
        Restaurant bayleaf = new Restaurant("Bayleaf", 4);
        bayleaf.setAddress("1 The Scores,\nSt Andrews");

        // • Create another object for restaurant CiaoItalia and assign suitable values
        // for all attributes.
        Restaurant ciaoItalia = new Restaurant("CiaoItalia");
        ciaoItalia.setAddress("10 North Street,\nSt Andrews");

        Restaurant testaurant = new Restaurant("Testaurant", 2);
        testaurant.setName();
        testaurant.setStarRating();
        // checking the values of restaurants print as expected - including the dishes
        // • Print the details of the two restaurants, including the dishes in their
        // menu.
        bayleaf.print();
        ciaoItalia.print();
        testaurant.print();

        // • Create objects for 2 of your favourite dishes and give them attribute
        // values.
        Dish pizza = new Dish();
        pizza.setName("Margherita Pizza");
        pizza.setPrice(5.99);
        pizza.setVegetarian(true);

        Dish pasta = new Dish();
        pasta.setName("Carbonara");
        pasta.setPrice(8.99);
        pasta.setVegetarian(false);

        // checking the values of dishes print as expected
        System.out.println("\n--- Printing Dish details ---");
        pizza.print();
        pasta.print();

        // • Make BayLeaf add the 2 dishes you created to its menu.
        System.out.println("\n--- Printing Restaurant details after dishes have been added ---");
        bayleaf.setDish1(pizza);
        bayleaf.print();
        bayleaf.setDish2(pasta);
        bayleaf.print();
        // check we have not accidentally affected ciaoItalia
        ciaoItalia.print();

        // • Change the price of one of the dishes.
        System.out.println("\n--- Printing Dish details before & after price has changed ---");
        pizza.print();
        pizza.setPrice(6.49);
        pizza.print();

        // • Create an object for a new dish and assign attribute values.
        Dish pie = new Dish();
        pie.setName("Chicken Pie");
        pie.setPrice(5.99);
        pie.setVegetarian(false);

        // check all the dishes still print as expected
        System.out.println("\n--- Printing all Dish details ---");
        pizza.print();
        pasta.print();
        pie.print();

        // • Increment BayLeaf’s star rating and print out its details again. Ensure the
        // output is correct.
        System.out.println("\n--- Printing Restaurant details before & after stars have incremented ---");
        bayleaf.print();
        bayleaf.incrementStarRating();
        bayleaf.print();
        // try to increment beyoud 5 to show it cannot be done
        System.out.println("\n--- Printing Restaurant details after incrementing beyond max star rating ---");
        bayleaf.incrementStarRating();
        bayleaf.print();

    }
}
