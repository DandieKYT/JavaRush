package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ui.pages.SearchUsersPage;

import static com.codeborne.selenide.Selenide.sleep;

public class SearchUsersStep {

    SearchUsersPage searchUsersPage = new SearchUsersPage();

    @Step("Поиск пользователя под ником 'Dandie KYT'")
    public void searchUser() {
        searchUsersPage.searchUser.setValue("Dandie KYT").pressEnter();
        sleep(5000);
    }

    @Step("Проверка результата поиска")
    public void checkoutResult() {
        searchUsersPage.checkoutResult.shouldBe(Condition.text("Dandie KYT"));
    }
}
