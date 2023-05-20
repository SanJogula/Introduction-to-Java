import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int X = scanner.nextInt();
        int Y = scanner.nextInt();
        if (X < 1 || X > N + 1) {
            System.out.println("Invalid position!");
        } else {
            // Create a new array with increased size
            int[] newArray = new int[N + 1];

            // Copy elements to new array
            for (int i = 0, j = 0; i < N + 1; i++, j++) {
                if (i == X - 1) {
                    newArray[i] = Y;
                    j--;
                } else {
                    newArray[i] = array[j];
                }
            }
            System.out.println("Array after insertion: " + Arrays.toString(newArray));
        }
    }
}
