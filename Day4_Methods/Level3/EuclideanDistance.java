public class EuclideanDistance {
    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    
    // Test the method
    public static void main(String[] args) {
        // Define points
        int[][] points = {
            {2, 3},   // Point A
            {5, 7},   // Point B
            {10, 15}, // Point C
            {4, 1}    // Point D
        };
        
        // Calculate and display distances between all pairs of points
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = calculateDistance(
                    points[i][0], points[i][1], 
                    points[j][0], points[j][1]
                );
                
                System.out.printf("Distance between (%d,%d) and (%d,%d): %.2f\n",
                    points[i][0], points[i][1],
                    points[j][0], points[j][1],
                    distance
                );
            }
        }
    }
}