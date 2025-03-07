import java.util.Random;

public class RandomTester {
    private Random random;

    public RandomTester() {
        random = new Random();
    }

    public void printOneRandom() {
        System.out.println(random.nextInt());
    }

    public void printMultiRandom(int howMany) {
        for (int i = 0; i < howMany; i++) {
            System.out.println(random.nextInt());
        }
    }

    public int throwDice() {
        return random.nextInt(6) + 1;
    }

    public String getResponse() {
        String[] responses = {"yes", "no", "maybe"};
        return responses[random.nextInt(responses.length)];
    }

    public int generateRandom(int max) {
        return random.nextInt(max) + 1;
    }

    public int generateRandom(int min, int max) {
        return random.nextInt(max - min + 1) + min;
    }
}