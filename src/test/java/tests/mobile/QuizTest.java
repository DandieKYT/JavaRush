package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class QuizTest extends TestBaseMobile {
    @Test
    @DisplayName("Прохождение опроса с тестом")
    void quizForQa() {
        quizStep.startButton();
        quizStep.secondStartButton();
        quizStep.languageRussian();
        quizStep.qaButton();
        quizStep.literaryStyle();
        quizStep.motivationNo();
        quizStep.lightTheme();
        quizStep.experienceYes();
        quizStep.startQuiz();
        quizStep.randomCheck();
        quizStep.checkoutCourse();
    }
}