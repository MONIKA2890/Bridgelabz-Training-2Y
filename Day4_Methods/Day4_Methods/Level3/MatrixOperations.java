public class MatrixOperations {
    // Method to display a matrix
    public static void displayMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    // Method to add two matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        
        return result;
    }
    
    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        
        return result;
    }
    
    // Method to multiply two matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;
        
        if (cols1 != rows2) {
            System.out.println("Matrices cannot be multiplied!");
            return null;
        }
        
        int[][] result = new int[rows1][cols2];
        
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        
        return result;
    }
    
    // Test the methods
    public static void main(String[] args) {
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        int[][] matrix2 = {{7, 8}, {9, 10}, {11, 12}};
        
        System.out.println("Matrix 1:");
        displayMatrix(matrix1);
        
        System.out.println("\nMatrix 2:");
        displayMatrix(matrix2);
        
        // For addition and subtraction, matrices must have the same dimensions
        int[][] matrix3 = {{1, 2}, {3, 4}};
        int[][] matrix4 = {{5, 6}, {7, 8}};
        
        System.out.println("\nMatrix 3:");
        displayMatrix(matrix3);
        
        System.out.println("\nMatrix 4:");
        displayMatrix(matrix4);
        
        System.out.println("\nMatrix 3 + Matrix 4:");
        displayMatrix(addMatrices(matrix3, matrix4));
        
        System.out.println("\nMatrix 3 - Matrix 4:");
        displayMatrix(subtractMatrices(matrix3, matrix4));
        
        System.out.println("\nMatrix 1 * Matrix 2:");
        displayMatrix(multiplyMatrices(matrix1, matrix2));
    }
}