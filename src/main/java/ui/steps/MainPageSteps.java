package ui.steps;

import io.qameta.allure.Step;
import ui.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

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
}
