import java.util.Scanner;

public class Squares {
    private int arraySize;
    Scanner sc = new Scanner(System.in);

    public void initArray() {
        System.out.print("Please input how large the array should be: ");
        arraySize = sc.nextInt();
        int[] array = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Please enter what number you would like in the array: ");
            array[i] = sc.nextInt();
        }
    }

    public void printSquares(int[] array) {
        for (int i = 0; i < arraySize; i++) {
            System.out.println(array[i]);
        }
    }
}
