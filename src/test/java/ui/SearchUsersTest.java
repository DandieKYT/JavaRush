package ui;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import ui.pages.SearchUsersPage;

import static com.codeborne.selenide.Selenide.sleep;
import static ui.steps.GenerationStep.generationRandomText;

@Tag("UI")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Раздел 'Пользователи'")
public class SearchUsersTest extends TestBase {

    SearchUsersPage searchUsersPage = new SearchUsersPage();

    String expectedName = "Dandie KYT";
    @Test
    @DisplayName("Поиск пользователя по имени")
    public void searchUserByName(){
        sideBarSteps.user();
        sleep(2000);
        searchUsersPage.searchUser.setValue(expectedName).pressEnter();
        sleep(5000);
        searchUsersPage.checkoutResult.shouldBe(Condition.text("Dandie KYT"));
    }
}
