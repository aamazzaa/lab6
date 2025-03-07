import java.util.HashSet;
import java.util.Scanner;

public class InputReader {
    private Scanner reader;

    public InputReader() {
        reader = new Scanner(System.in);
    }

    public HashSet<String> getInput() {
        System.out.print("> "); // print prompt
        String inputLine = reader.nextLine().trim().toLowerCase();

        // Split input at spaces and add words to HashSet
        String[] wordArray = inputLine.split("\\s+");
        HashSet<String> words = new HashSet<>();
        for (String word : wordArray) {
            words.add(word);
        }
        return words;
    }
}