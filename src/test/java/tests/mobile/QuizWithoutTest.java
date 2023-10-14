package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")

public class QuizWithoutTest extends TestBaseMobile {
    @Test
    @DisplayName("Прохождение опроса без теста")
    void checkoutTest() {
        quizStep.startButton();
        quizStep.secondStartButton();
        quizStep.languageRussian();
        quizStep.qaButton();
        quizStep.literaryStyle();
        quizStep.motivationNo();
        quizStep.lightTheme();
        quizStep.experienceNo();
        quizStep.checkoutTitle();
    }
}
