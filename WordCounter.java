import java.util.HashMap;
import java.util.HashSet;

/**
 * Keeps a record of how many times each word was entered by users.
 * 
 * @author 
 * @version 1.1 (2025.03.06)
 */
public class WordCounter {
    private HashMap<String, Integer> counts;

    /**
     * Creates a WordCounter.
     */
    public WordCounter() {
        counts = new HashMap<>();
    }

    /**
     * Update the usage count of all words in input.
     * @param input A set of words entered by the user.
     */
    public void addWords(HashSet<String> input) {
        for (String word : input) {
            int counter = counts.getOrDefault(word, 0);
            counts.put(word, counter + 1);
        }
    }

    /**
     * Print the usage count of words, excluding those already present in responseMap.
     * @param responseMap The map of predefined responses.
     */
    public void printWordCounts(HashMap<String, String> responseMap) {
        System.out.println("\nWord Usage Count:");
        for (String word : counts.keySet()) {
            if (!responseMap.containsKey(word)) {
                System.out.println(word + ": " + counts.get(word));
            }
        }
    }
}
