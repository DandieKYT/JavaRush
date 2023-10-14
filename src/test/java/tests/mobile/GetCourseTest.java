package tests.mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
//
@Tag("Mobile")
public class GetCourseTest extends TestBaseMobile {
    @Test
    @DisplayName("Прохождение опроса для QA с последующим получением курса")
    void takingTheQASurveyAndThenReceivingTheCourse() {
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

    @Test
    @DisplayName("Прохождение опроса без теста с получением курса")
    void takingASurveyWithoutATestAndReceivingACourse() {
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