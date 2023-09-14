package tests.ui;



import java.util.Random;

public class ForTest {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }
}
