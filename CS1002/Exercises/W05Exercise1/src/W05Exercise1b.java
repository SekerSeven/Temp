import java.util.Scanner;

public class W05Exercise1b {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int x = 0;
        while (x != -1) {
            System.out.print("Please input an integer: ");
            x = sc.nextInt();
            if (x != -1) {
                System.out.println("\n" + x * 2);
            } else {
            }
        }

        System.out.println("\n");

        Scanner sc2 = new Scanner(System.in);
        String y = "";
        while (!y.equals("quit")) {
            System.out.print("Please input a string: ");
            y = sc2.nextLine();
            if (!y.equals("quit")) {
                System.out.println(y.length());
            } else {
            }
        }

        System.out.println("\n");

        Scanner sc3 = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String z = sc3.nextLine();
        for (int i = 0; i < z.length(); i++) {
            System.out.println(z.charAt(i));
        }

        System.out.println("\n");

        Scanner sc4 = new Scanner(System.in);
        System.out.print("Please input an integer: ");
        int a = sc4.nextInt();
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
