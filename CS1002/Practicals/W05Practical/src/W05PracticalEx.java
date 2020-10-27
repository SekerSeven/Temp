import java.util.Scanner;

public class W05PracticalEx {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Converter con = new Converter();
        ConverterEx conEx = new ConverterEx();
        System.out.println("Would you like to convert from kilograms to stones, pounds and ounces (y/n)?");
        String direction = sc.nextLine();
        if (direction.equals("y")) {
            System.out.println("Enter weight in kilograms");
            int weightKG = sc.nextInt();
            con.convert(weightKG);
            con.print();
        } else if (direction.equals("n")) {
            System.out.println("Enter weight in stone:");
            int weightSto = sc.nextInt();
            System.out.println("Pounds:");
            int weightPou = sc.nextInt();
            System.out.println("and Ounces:");
            int weightOun = sc.nextInt();
            conEx.convert(weightSto, weightPou, weightOun);
            conEx.print();
        }

    }
}
