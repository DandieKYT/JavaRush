package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class SearchPage {

    private SelenideElement users = $x("//*[contains(@class, 'sidebar-nav__sections')]/div[4]/div[2]/div/a"),
                            searchUser = $x("//*[contains(@class, 'filter__container')]/div/jr-section-search-panel/div/div/div/input"),
                            checkoutResult = $x("//div[text()='Dandie KYT']");


    public SearchPage users() {
        step("Открытие вкладки 'Пользователи'", () -> {
            users.click();
        });
        return this;
    }
    public SearchPage searchUser() {
        step("Поиск пользователя под ником 'Dandie KYT'", () -> {
            searchUser.setValue("Dandie KYT").pressEnter();
            sleep(5000);
        });
        return this;
    }
    public SearchPage checkoutResult() {
        step("Поиск пользователя под ником 'Dandie KYT'", () -> {
            checkoutResult.shouldBe(Condition.text("Dandie KYT"));
        });
        return this;
    }

}
