package mobile;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("Mobile")
public class CreateAccountTest extends TestBaseMobile {

    @Test
    @DisplayName("Прохождение опроса для QA с последующим получением курса")
    void takingTheQASurveyAndThenReceivingTheCourse() {
        createAccountStep.startButton();
        createAccountStep.secondStartButton();
        createAccountStep.languageRussian();
        createAccountStep.qaButton();
        createAccountStep.literaryStyle();
        createAccountStep.motivationNo();
        createAccountStep.lightTheme();
        createAccountStep.experienceYes();
        createAccountStep.startQuiz();
        createAccountStep.randomCheck();
        createAccountStep.checkoutCourse();
    }

    @Test
    @DisplayName("Прохождение опроса без теста с получением курса")
    void takingASurveyWithoutATestAndReceivingACourse() {
        createAccountStep.startButton();
        createAccountStep.secondStartButton();
        createAccountStep.languageRussian();
        createAccountStep.qaButton();
        createAccountStep.literaryStyle();
        createAccountStep.motivationNo();
        createAccountStep.lightTheme();
        createAccountStep.experienceNo();
        createAccountStep.checkoutTitle();
    }
}