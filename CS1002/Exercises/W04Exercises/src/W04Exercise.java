public class W04Exercise {
    public static void main(String[] args) throws Exception {
        Restaurant bayleaf = new Restaurant();
        bayleaf.setName("BayLeaf");
        bayleaf.setAddress("10 The Belvedere, Burnham-On-Crouch, CM0 8AW");
        bayleaf.setStarRating(4);
        bayleaf.dish1.setName("Dish 1");
        bayleaf.dish1.setPrice(12.00);
        bayleaf.dish1.setVegetarian(true);
        bayleaf.dish2.setName("Dish 2");
        bayleaf.dish2.setPrice(9.00);
        bayleaf.dish2.setVegetarian(true);
        bayleaf.print();

        Dish taco = new Dish();
        taco.setName("Kidney bean Tacos");
        taco.setPrice(7.75);
        taco.setVegetarian(true);

        Dish ramen = new Dish();
        ramen.setName("Prawn Tempura Ramen");
        ramen.setPrice(14.50);
        ramen.setVegetarian(false);

        bayleaf.setDish1(taco);
        bayleaf.setDish2(ramen);
        bayleaf.dish1.setPrice(8.00);
        bayleaf.incrementRating();
        bayleaf.print();

        Restaurant ciaoItalia = new Restaurant();
        ciaoItalia.setName("CiaoItalia");
        ciaoItalia.setAddress("6 Carlingcott, BA2 8AR");
        ciaoItalia.setStarRating(3);
        ciaoItalia.dish1.setName("The Fishy one");
        ciaoItalia.dish1.setPrice(10.00);
        ciaoItalia.dish1.setVegetarian(false);
        ciaoItalia.dish2.setName("The Green one");
        ciaoItalia.dish2.setPrice(7.50);
        ciaoItalia.dish2.setVegetarian(true);
        ciaoItalia.print();

    }
}
