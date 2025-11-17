import java.util.Random;

public class FootballTeamHeights {

    // Method to calculate the sum of all heights
    public static int calculateSum(int[] heights) {
        int sum = 0;
        for (int h : heights) {
            sum += h;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double calculateMean(int[] heights) {
        int sum = calculateSum(heights);
        return (double) sum / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int h : heights) {
            if (h < min) {
                min = h;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int h : heights) {
            if (h > max) {
                max = h;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();
        int[] heights = new int[11];

        // Generating random heights between 150 and 250
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // 150 to 250
        }

        // Display all player heights
        System.out.print("Heights of players: ");
        for (int h : heights) {
            System.out.print(h + " ");
        }
        System.out.println();

        // Calculate and display results
        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("\nResults:");
        System.out.println("Total Sum of Heights: " + sum + " cm");
        System.out.println("Mean Height: " + mean + " cm");
        System.out.println("Shortest Height: " + shortest + " cm");
        System.out.println("Tallest Height: " + tallest + " cm");
    }
}
