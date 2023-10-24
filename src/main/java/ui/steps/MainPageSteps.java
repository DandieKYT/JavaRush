package ui.steps;

import io.qameta.allure.Step;
import ui.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.switchTo;

public class MainPageSteps {
    MainPage mainPage = new MainPage();
    @Step("Нажатие на кнопку 'Начать обучение'")
    public void startLearnButton() {
        open("/");
        mainPage.startLearnButton.click();
    }

    @Step("Открытие вкладки 'Пользователи'")
    public void user() {
        open("/");
        mainPage.users.click();
    }

    @Step("Открытие вкладки Java-университет")
    public void openJavaUniversity() {
        open("/");
        mainPage.openJavaUniversity.click();
        switchTo().window(1);
    }
}
