import cs1002.*;

public class LiveCodingW01 {
    public static void main(String[] args) {
        BurgerMaker maker = new BurgerMaker(false);
        maker.addBottomBun();
        maker.addPatty();
        maker.addCheese();
        maker.addTopBun();
    }
}
