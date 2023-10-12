package tests.ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Создание аккаунта")
public class CreateAccountTest extends TestBase {

    @Test
    @DisplayName("Создание аккаунта в JAVA-Rush")
    public void startLearnJava() {
        learningStep.startLearnButton();
        learningStep.beginLearnButton();
        learningStep.russianLanguageButton();
        learningStep.qaButton();
        learningStep.blackPictureClick();
        learningStep.notNowButton();
        learningStep.xpInProgrammingNo();
        learningStep.checkOutResult();
    }
}
