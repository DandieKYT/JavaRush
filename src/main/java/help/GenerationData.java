package help;

import com.github.javafaker.Faker;

import java.util.Random;

public class GenerationData {
    public static String generationRandomText() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }
}
