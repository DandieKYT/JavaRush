package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
public class SearchTest extends TestBase {
    @Test
    @DisplayName("Поиск пользователя по имени")
    public void searchUser() {
        searchStep.user();
        searchStep.searchUser();
        searchStep.checkoutResult();
    }
}
