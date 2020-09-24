import java.util.Scanner;

public class W02Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the prices of the three burgers: ");
        double burgerPrice = input.nextDouble();
        double burgerPrice2 = input.nextDouble();
        double burgerPrice3 = input.nextDouble();
        System.out.println(
                "The average price of the three burgers is: £" + (burgerPrice + burgerPrice2 + burgerPrice3) / 3);

    }
}