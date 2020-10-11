import java.util.Scanner;

public class W05Practical {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Converter con = new Converter();
        System.out.println("Enter weight in kilograms");
        int weightKG = sc.nextInt();
        con.convert(weightKG);
        con.print();
    }
}