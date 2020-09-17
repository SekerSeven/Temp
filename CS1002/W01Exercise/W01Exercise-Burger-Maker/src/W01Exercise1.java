import cs1002.*;

public class W01Exercise1 {
    public static void main(String[] args) {
        BurgerMaker maker = new BurgerMaker(false);
        maker.addBottomBun();
        maker.addLettuce();
        maker.addPatty();
        maker.addBacon();
        maker.addOnions();
        maker.addMushrooms();
        maker.addTopBun();
    }
}
