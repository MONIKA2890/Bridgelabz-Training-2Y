
import java.util.*;

public class RockPaperScissors {
    static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        } else return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rounds, userWins = 0, compWins = 0;

        System.out.print("Enter number of games: ");
        rounds = sc.nextInt();

        for (int i = 1; i <= rounds; i++) {
            System.out.print("Enter your choice (rock/paper/scissors): ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();

            String winner = findWinner(user, comp);

            System.out.println("Computer chose: " + comp);
            System.out.println("Round " + i + " Winner: " + winner);

            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        System.out.println("\nFinal Results:");
        System.out.println("User Wins: " + userWins);
        System.out.println("Computer Wins: " + compWins);
        System.out.println("Draws: " + (rounds - userWins - compWins));

        double userPercent = (userWins * 100.0) / rounds;
        double compPercent = (compWins * 100.0) / rounds;

        System.out.printf("User Winning %%: %.2f\n", userPercent);
        System.out.printf("Computer Winning %%: %.2f\n", compPercent);
    }
}
