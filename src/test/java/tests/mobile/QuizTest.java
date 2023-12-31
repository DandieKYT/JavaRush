package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class QuizTest extends TestBaseMobileRemote {
    @Test
    @DisplayName("Прохождение опроса с тестом")
    void quizForQa() {
        quizPage.startButton()
                .secondStartButton()
                .languageRussian()
                .qaButton()
                .literaryStyle()
                .motivationNo()
                .lightTheme()
                .experienceYes()
                .startQuiz();
            quizPage.randomCheck();
            quizPage.checkoutCourse();
    }
}