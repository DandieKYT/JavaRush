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
@Story("Поиск в разделе 'Пользователи'")
public class SearchTest extends TestBase {

    @Test
    @DisplayName("Поиск пользователя по имени")
    public void searchUser() {
        searchStep.user();
        searchStep.searchUser();
        searchStep.checkoutResult();
    }
}
