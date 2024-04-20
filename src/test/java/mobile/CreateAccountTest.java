package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
@Owner("Кудрявцев Даниил")
@Story("Создание аккаунта")
@Feature("Автотесты для Mobile")
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
        quizStep.startQuiz();
        quizStep.randomCheck();
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