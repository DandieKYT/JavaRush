package help;

import com.github.javafaker.Faker;

public class Generations {
    public static
    String generationRandomText() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
