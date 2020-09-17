import cs1002.*;

public class W01Exercise2 {
    public static void main(String[] args) {
        Burger firstBurger = new Burger();
        Burger secondBurger = new Burger();
        firstBurger.addBottomBun();
        firstBurger.addLettuce();
        firstBurger.addPatty();
        firstBurger.addBacon();
        firstBurger.addOnions();
        firstBurger.addMushrooms();
        firstBurger.addTopBun();
        firstBurger.setName("My favourite burger");
        firstBurger.setPrice(6.99);

        secondBurger.addBottomBun();
        secondBurger.addTomato();
        secondBurger.addVeggiePatty();
        secondBurger.addCheese();
        secondBurger.addPickles();
        secondBurger.addTopBun();
        secondBurger.setPrice(0.00);
        secondBurger.setName("Just take it, please");
        MultiBurgerDisplay display = new MultiBurgerDisplay(firstBurger, secondBurger);
    }
}
