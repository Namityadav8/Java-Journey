 import java.util.Scanner;

public class Jagged {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        // Creating the jagged array
        int[][] jaggedArray = new int[rows][];

        // Taking input for each row
        for (int i = 0; i < rows; i++) {
            System.out.print("Enter the number of elements in row " + (i + 1) + ": ");
            int cols = scanner.nextInt();
            jaggedArray[i] = new int[cols];

            System.out.print("Enter elements for row " + (i + 1) + ": ");
            for (int j = 0; j < cols; j++) {
                jaggedArray[i][j] = scanner.nextInt();
            }
        }

        // Displaying the jagged array
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
 
