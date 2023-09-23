package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class QuizWithoutTest extends TestBaseMobileRemote {
    @Test
    @DisplayName("Прохождение опроса без теста")
    void checkoutTest() {
        quizPage.startButton()
                .secondStartButton()
                .languageRussian()
                .qaButton()
                .literaryStyle()
                .motivationNo()
                .lightTheme()
                .experienceNo()
                .checkoutTitle();
    }
}
