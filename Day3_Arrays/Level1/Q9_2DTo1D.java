
import java.util.Scanner;

public class Q9_2DTo1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        int[][] matrix = new int[rows][cols];
        int[] oneD = new int[rows * cols];
        int index = 0;

        // Input elements
        System.out.println("Enter elements of matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Copy into 1D
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                oneD[index++] = matrix[i][j];
            }
        }

        // Display 1D array
        System.out.print("1D Array: ");
        for (int val : oneD) {
            System.out.print(val + " ");
        }
        sc.close();
    }
}