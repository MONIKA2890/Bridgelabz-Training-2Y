import java.util.*;


public class RatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>(Arrays.asList(5, null, 4, 2));

        List<Integer> allRatings = new ArrayList<>();
        for (int r : oldRatings) allRatings.add(r);
        allRatings.addAll(newRatings);

        double avg = allRatings.stream()
                .filter(Objects::nonNull)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println("Average Rating: " + avg);
    }
}

