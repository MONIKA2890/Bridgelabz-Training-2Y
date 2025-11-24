import java.util.*;

public class VotingCountElection {
    public static void main(String[] args) {

       
        Map<String, Integer> voteCount = new HashMap<>();

        
        String[] votes = {
                "Amit", "Riya", "Amit", "Karan", "Riya",
                "Amit", "Karan", "Amit", "Riya", "Amit"
        };

       
        for (String candidate : votes) {
            voteCount.put(candidate, voteCount.getOrDefault(candidate, 0) + 1);
        }

       
        System.out.println("Total Votes Each Candidate Got:");
        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            System.out.println(entry.getKey() + " → " + entry.getValue() + " votes");
        }

      
        String winner = null;
        int maxVotes = -1;

        for (Map.Entry<String, Integer> entry : voteCount.entrySet()) {
            if (entry.getValue() > maxVotes) {
                maxVotes = entry.getValue();
                winner = entry.getKey();
            }
        }

        
        System.out.println("\nWinner of the Election: " + winner + " with " + maxVotes + " votes.");
    }
}

