import java.util.HashSet;
import java.util.Scanner;

/**
 * Reads user input from the terminal and converts it into a set of words.
 * 
 * @author 
 * @version 1.1 (2025.03.06)
 */
public class InputReader {
    private Scanner reader;

    /**
     * Creates a new InputReader.
     */
    public InputReader() {
        reader = new Scanner(System.in);
    }

    /**
     * Reads a line of text and returns a set of words.
     * @return A set of words from user input.
     */
    public HashSet<String> getInput() {
        System.out.print("> ");
        String inputLine = reader.nextLine().trim().toLowerCase();
        String[] wordArray = inputLine.split(" ");

        HashSet<String> words = new HashSet<>();
        for (String word : wordArray) {
            words.add(word);
        }
        return words;
    }
}
