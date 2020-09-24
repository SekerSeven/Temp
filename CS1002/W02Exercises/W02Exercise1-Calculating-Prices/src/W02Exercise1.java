import java.util.Scanner;

public class W02Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Price 1:");
        double burgerPrice = input.nextDouble();
        System.out.println("Price 2:");
        double burgerPrice2 = input.nextDouble();
        System.out.println("Price 3:");
        double burgerPrice3 = input.nextDouble();
        System.out.println("The average price is " + (burgerPrice + burgerPrice2 + burgerPrice3) / 3);

    }
}