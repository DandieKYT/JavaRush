package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static ui.pages.SearchPage.*;

public class SearchStep {

    @Step("Открытие вкладки 'Пользователи'")
    public void user() {
        open("/");
            users.click();
    }

    @Step("Поиск пользователя под ником 'Dandie KYT'")
    public void searchUser() {
            searchUser.setValue("Dandie KYT").pressEnter();
            sleep(5000);
    }

    @Step("Проверка результата поиска")
    public void checkoutResult() {
            checkoutResult.shouldBe(Condition.text("Dandie KYT"));
    }
}
