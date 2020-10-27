import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an integer: ");
        int x = sc.nextInt();
        switch (x) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            case x >= 3:
                System.out.println("3");
        }
    }
}