import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Random;

/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response based on specified input.
 * 
 * Internally, the responder uses a HashMap to associate words with response
 * strings and a list of default responses.
 * 
 * @author 
 * @version 1.1 (2025.03.06)
 */
public class Responder {
    private HashMap<String, String> responseMap;
    private ArrayList<String> defaultResponses;
    private Random randomGenerator;

    /**
     * Constructs a Responder.
     */
    public Responder() {
        responseMap = new HashMap<>();
        defaultResponses = new ArrayList<>();
        fillResponseMap();
        fillDefaultResponses();
        randomGenerator = new Random();
    }

    /**
     * Generates a response from a given set of input words.
     * @param words A set of words entered by the user.
     * @return A response string.
     */
    public String generateResponse(HashSet<String> words) {
        for (String word : words) {
            String response = responseMap.get(word);
            if (response != null) {
                return response;
            }
        }
        return pickDefaultResponse();
    }

    /**
     * Provides access to responseMap.
     * @return The response map.
     */
    public HashMap<String, String> getResponseMap() {
        return responseMap;
    }

    private void fillResponseMap() {
        responseMap.put("crash", "Tell me more about the crash.");
        responseMap.put("slow", "Have you tried restarting?");
    }

    private void fillDefaultResponses() {
        defaultResponses.add("That sounds odd. Can you elaborate?");
        defaultResponses.add("I need more details to assist you.");
    }

    /**
     * Picks a random default response.
     * @return A random default response.
     */
    private String pickDefaultResponse() {
        int index = randomGenerator.nextInt(defaultResponses.size());
        return defaultResponses.get(index);
    }
}
