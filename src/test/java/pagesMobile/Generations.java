package pagesMobile;

import com.github.javafaker.Faker;

public class Generations {
    public static
    String generationRandomName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }


}
