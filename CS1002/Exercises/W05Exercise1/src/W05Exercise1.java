public class W05Exercise1 {
    public static void main(String[] args) throws Exception {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println("\n");

        for (i = -2; i < 5; i++) {
            System.out.print(i + ", ");
        }

        System.out.println("\n");

        for (i = 6; i < 19; i += 2) {
            System.out.print(i + ", ");
        }

        System.out.println("\n");

        for (i = 10; i < 51; i += 10) {
            System.out.print(i + ", ");
        }

        System.out.println("\n");

        for (i = 68; i > 43; i -= 3) {
            System.out.print(i + ", ");
        }

        System.out.println("\n");

        for (i = 1; i < 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("x");
            }
            System.out.print(", ");
        }
    }
}
