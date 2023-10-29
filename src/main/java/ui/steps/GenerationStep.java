package ui.steps;

import com.github.javafaker.Faker;

public class GenerationStep {
    public static String generationRandomText() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
