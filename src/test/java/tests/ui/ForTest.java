package tests.ui;



import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class ForTest {
    public static int getRandomNumber() {
        Random random = new Random();
        return random.nextInt(4) + 1;
    }

    @Test
    void someFor(){
        for (int i=0; i<10 ; i++) { // откроет и закроет 10 раз страницу гугл
            Selenide.open("http://www.google.com");
        }
    }
}
