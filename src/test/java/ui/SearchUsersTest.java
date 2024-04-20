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
@Story("Раздел 'Пользователи'")
public class SearchUsersTest extends TestBase {

    String expectedName = "Dandie KYT";

    @Test
    @DisplayName("Поиск пользователя по имени")
    public void searchUserByName() {
        sideBarSteps.user();
        searchUserStep.searchUser(expectedName);
        searchUserStep.checkoutResult(expectedName);
    }
}
