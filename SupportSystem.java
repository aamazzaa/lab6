import java.util.HashSet;

/**
 * This class implements a technical support system. It is the top-level class
 * in this project. The support system communicates via text input/output
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the user wants to 
 * leave.
 * 
 * @author Michael Kölling and David J. Barnes
 * @version 1.1 (2025.03.06)
 */
public class SupportSystem {
    private InputReader reader;
    private Responder responder;
    private WordCounter counter;
    private static int instanceCount = 0;

    /**
     * Creates a technical support system.
     */
    public SupportSystem() {
        reader = new InputReader();
        responder = new Responder();
        counter = new WordCounter();
        instanceCount++;
    }

    /**
     * Start the technical support system. This will print a welcome message and enter
     * into a dialog with the user, until the user ends the dialog.
     */
    public void start() {
        boolean finished = false;
        printWelcome();

        while (!finished) {
            HashSet<String> input = reader.getInput();

            if (input.contains("bye")) {
                finished = true;
            } else {
                counter.addWords(input);
                String response = responder.generateResponse(input);
                System.out.println(response);
            }
        }
        printGoodbye();
        counter.printWordCounts(responder.getResponseMap());
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome() {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println("Please tell us about your problem.");
        System.out.println("Type 'bye' to exit.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye() {
        System.out.println("Nice talking to you. Bye...");
    }

    /**
     * Get the number of instances created.
     * @return The number of instances created.
     */
    public static int numberOfInstances() {
        return instanceCount;
    }

    /**
     * Main method to run the support system.
     */
    public static void main(String[] args) {
        SupportSystem system = new SupportSystem();
        system.start();
    }
}
