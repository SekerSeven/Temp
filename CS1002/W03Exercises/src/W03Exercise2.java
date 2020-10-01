import java.util.Scanner;

public class W03Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the height of the mug to the nearest integer (in cm): ");
        int mugHeight = input.nextInt();
        System.out.print("Input the radius of the mug to the nearest integer (in cm): ");
        int mugRadius = input.nextInt();
        Mug cup = new Mug();
        double mugVol = cup.calcVol(mugHeight, mugRadius);
        System.out.print("Input the number of marshmallows per litre you would like: ");
        double marshmallowLimit = input.nextInt() * mugVol;
        System.out.print("Input the number of marshmallows put in your coffee: ");
        int noOfMarshmallows = input.nextInt();
        if (cup.putMarshmallows(noOfMarshmallows, marshmallowLimit) == true) {
            System.out.println("The balance of coffee and marshmallows is good");
        } else {
            System.out.println("You are trying to put too many marshmallows in your coffee! The maximum number is "
                    + marshmallowLimit);
        }

    }
}