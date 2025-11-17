public class CollinearPoints {
    // Method to check if three points are collinear using slope
    public static boolean areCollinearBySlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate slopes
        // Avoid division by using cross multiplication
        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }
    
    // Method to check if three points are collinear using triangle area
    public static boolean areCollinearByArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        // Calculate area using determinant formula
        int area = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
        return area == 0;
    }
    
    // Test the methods
    public static void main(String[] args) {
        // Points A(2,4), B(4,6), C(6,8)
        int x1 = 2, y1 = 4;
        int x2 = 4, y2 = 6;
        int x3 = 6, y3 = 8;
        
        System.out.println("Points: A(" + x1 + "," + y1 + "), B(" + x2 + "," + y2 + "), C(" + x3 + "," + y3 + ")");
        System.out.println("Are collinear (by slope): " + areCollinearBySlope(x1, y1, x2, y2, x3, y3));
        System.out.println("Are collinear (by area): " + areCollinearByArea(x1, y1, x2, y2, x3, y3));
    }
}