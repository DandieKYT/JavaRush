package ui.steps;

import io.qameta.allure.Step;
import ui.pages.MainPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.open;

public class HeaderStep {

    MainPage mainPage = new MainPage();

    @Step("Открытие вкладки")
    public void opensTitle(String param) {
        open("/");
        mainPage.openTitle(param).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checksTitle(String expectedText) {
        mainPage.checkTitle(expectedText).shouldBe(text(expectedText));
    }
}
