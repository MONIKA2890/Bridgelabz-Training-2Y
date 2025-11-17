public class MatrixDeterminantInverse {
    // Method to display a matrix
    public static void displayMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%.2f\t", matrix[i][j]);
            }
            System.out.println();
        }
    }
    
    // Method to calculate determinant of a 2x2 matrix
    public static double determinant2x2(double[][] matrix) {
        return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }
    
    // Method to calculate determinant of a 3x3 matrix
    public static double determinant3x3(double[][] matrix) {
        return matrix[0][0] * (matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1]) -
               matrix[0][1] * (matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]) +
               matrix[0][2] * (matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0]);
    }
    
    // Method to calculate inverse of a 2x2 matrix
    public static double[][] inverse2x2(double[][] matrix) {
        double det = determinant2x2(matrix);
        
        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse!");
            return null;
        }
        
        double[][] inverse = new double[2][2];
        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;
        
        return inverse;
    }
    
    // Method to calculate inverse of a 3x3 matrix
    public static double[][] inverse3x3(double[][] matrix) {
        double det = determinant3x3(matrix);
        
        if (det == 0) {
            System.out.println("Matrix is singular, cannot find inverse!");
            return null;
        }
        
        double[][] inverse = new double[3][3];
        
        // Calculate the cofactor matrix
        double[][] cofactor = new double[3][3];
        
        // First row
        cofactor[0][0] = matrix[1][1] * matrix[2][2] - matrix[1][2] * matrix[2][1];
        cofactor[0][1] = -(matrix[1][0] * matrix[2][2] - matrix[1][2] * matrix[2][0]);
        cofactor[0][2] = matrix[1][0] * matrix[2][1] - matrix[1][1] * matrix[2][0];
        
        // Second row
        cofactor[1][0] = -(matrix[0][1] * matrix[2][2] - matrix[0][2] * matrix[2][1]);
        cofactor[1][1] = matrix[0][0] * matrix[2][2] - matrix[0][2] * matrix[2][0];
        cofactor[1][2] = -(matrix[0][0] * matrix[2][1] - matrix[0][1] * matrix[2][0]);
        
        // Third row
        cofactor[2][0] = matrix[0][1] * matrix[1][2] - matrix[0][2] * matrix[1][1];
        cofactor[2][1] = -(matrix[0][0] * matrix[1][2] - matrix[0][2] * matrix[1][0]);
        cofactor[2][2] = matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        
        // Transpose the cofactor matrix to get the adjugate matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                inverse[i][j] = cofactor[j][i] / det;
            }
        }
        
        return inverse;
    }
    
    // Test the methods
    public static void main(String[] args) {
        // 2x2 matrix
        double[][] matrix2x2 = {{4, 7}, {2, 6}};
        
        System.out.println("2x2 Matrix:");
        displayMatrix(matrix2x2);
        
        System.out.println("\nDeterminant: " + determinant2x2(matrix2x2));
        
        double[][] inverse2x2 = inverse2x2(matrix2x2);
        if (inverse2x2 != null) {
            System.out.println("\nInverse:");
            displayMatrix(inverse2x2);
        }
        
        // 3x3 matrix
        double[][] matrix3x3 = {{1, 2, 3}, {0, 1, 4}, {5, 6, 0}};
        
        System.out.println("\n3x3 Matrix:");
        displayMatrix(matrix3x3);
        
        System.out.println("\nDeterminant: " + determinant3x3(matrix3x3));
        
        double[][] inverse3x3 = inverse3x3(matrix3x3);
        if (inverse3x3 != null) {
            System.out.println("\nInverse:");
            displayMatrix(inverse3x3);
        }
    }
}