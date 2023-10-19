package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("UITest")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Переход в соц сети")
public class CreateAccountWithQuizTest extends TestBase {

    @Test
    @DisplayName("Создание аккаунта с прохождением теста")
    public void someTest() {
        startLearnStep.startLearnButton();
        startLearnStep.beginLearnButton();
        startLearnStep.russianLanguageButton();
        startLearnStep.qaButton();
        startLearnStep.blackPictureClick();
        startLearnStep.notNowButton();
        startLearnStep.xpInProgrammingYes();
        startLearnStep.testBeginButton();
        startLearnStep.randomCheck();
        startLearnStep.checkOutResult();
    }
}



