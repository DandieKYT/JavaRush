package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UI")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Создание аккаунта")
public class CreateAccountTest extends TestBase {

    @Test
    @DisplayName("Создание аккаунта без прохождения теста")
    public void createAccount() {
        mainPageSteps.startLearnButton();
        createAccountStep.beginLearnButton();
        createAccountStep.russianLanguageButton();
        createAccountStep.qaButton();
        createAccountStep.blackPictureClick();
        createAccountStep.notNowButton();
        createAccountStep.xpInProgrammingNo();
        createAccountStep.checkOutResult();
    }

    @Test
    @DisplayName("Создание аккаунта с прохождением теста")
    public void createAccountWithQuiz() {
        mainPageSteps.startLearnButton();
        createAccountStep.beginLearnButton();
        createAccountStep.russianLanguageButton();
        createAccountStep.qaButton();
        createAccountStep.blackPictureClick();
        createAccountStep.notNowButton();
        createAccountStep.xpInProgrammingYes();
        quizStep.testBeginButton();
        quizStep.randomCheck();
        createAccountStep.checkOutResult();
    }
}
