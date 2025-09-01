
import java.util.*;

public class DeckOfCards {

    // Initialize deck
    static String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10",
                          "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[suits.length * ranks.length];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    // Shuffle deck
    static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCard = i + rand.nextInt(deck.length - i); // between i and end
            String temp = deck[i];
            deck[i] = deck[randomCard];
            deck[randomCard] = temp;
        }
    }

    // Distribute deck among players
    static String[][] distribute(String[] deck, int players, int cardsEach) {
        if (players * cardsEach > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }

        String[][] playerCards = new String[players][cardsEach];
        int index = 0;
        for (int i = 0; i < players; i++) {
            for (int j = 0; j < cardsEach; j++) {
                playerCards[i][j] = deck[index++];
            }
        }
        return playerCards;
    }

    // Print players and their cards
    static void printPlayers(String[][] playerCards) {
        if (playerCards == null) return;
        for (int i = 0; i < playerCards.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : playerCards[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Initialize
        String[] deck = initializeDeck();

        // Step 2: Shuffle
        shuffleDeck(deck);

        // Step 3: Distribute
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter number of cards per player: ");
        int cardsEach = sc.nextInt();

        String[][] playerCards = distribute(deck, players, cardsEach);

        // Step 4: Print result
        printPlayers(playerCards);

        sc.close();
    }
}
