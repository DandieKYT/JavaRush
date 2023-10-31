package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ui.pages.SearchUsersPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchUserStep {

    SearchUsersPage searchUsersPage = new SearchUsersPage();

    @Step("Поиск пользователя под ником 'Dandie KYT'")
    public void searchUser(String expectedName) {
        searchUsersPage.searchUser.setValue(expectedName).pressEnter();
        sleep(5000);
    }

    @Step("Проверка результата поиска")
    public void checkoutResult(String actualName) {
        searchUsersPage.checkoutResult.shouldBe(Condition.text(actualName));
    }
}
