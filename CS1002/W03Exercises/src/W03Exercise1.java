import java.util.Scanner;

public class W03Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the height of the mug to the nearest integer (in cm): ");
        int mugHeight = input.nextInt();
        System.out.print("Input the radius of the mug to the nearest integer (in cm): ");
        int mugRadius = input.nextInt();
        Mug cup = new Mug();
        double mugSA = cup.calcSA(mugRadius);
        System.out.println("The top surface area of the mug is: " + mugSA + " cm^2");
        double mugVol = cup.calcVol(mugHeight, mugRadius);
        System.out.println("The volume of the mug is: " + mugVol + " L");
    }
}