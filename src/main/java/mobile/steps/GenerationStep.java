package mobile.steps;

import com.github.javafaker.Faker;

import java.util.Random;

public class GenerationStep {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(5);
    }

    public static String generationRandomText() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
