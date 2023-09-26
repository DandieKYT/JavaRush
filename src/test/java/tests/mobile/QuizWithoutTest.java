package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("Mobile")

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
