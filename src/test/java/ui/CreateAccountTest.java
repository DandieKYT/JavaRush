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
    @DisplayName("Создание аккаунта")
    public void createAccountWithQuiz() {
        common.stepsForWebApp();
        createAccountStep.checkOutResult();
        common.stepsForDeleteAccount();
    }
}
