package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ui.pages.SearchPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static ui.pages.SearchPage.*;

public class SearchStep {
    SearchPage searchPage = new SearchPage();
    @Step("Открытие вкладки 'Пользователи'")
    public void user() {
        open("/");
        searchPage.users.click();
    }

    @Step("Поиск пользователя под ником 'Dandie KYT'")
    public void searchUser() {
        searchPage.searchUser.setValue("Dandie KYT").pressEnter();
            sleep(5000);
    }

    @Step("Проверка результата поиска")
    public void checkoutResult() {
        searchPage.checkoutResult.shouldBe(Condition.text("Dandie KYT"));
    }
}
