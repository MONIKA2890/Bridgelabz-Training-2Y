import java.util.*;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100) + 1; // 1 to 100
        int guess;

        System.out.println("Guess a number between 1 and 100");

        do {
            guess = sc.nextInt();
            if (guess > number) {
                System.out.println("Too high! Try again.");
            } else if (guess < number) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Correct! The number was " + number);
            }
        } while (guess != number);
    }
}
