package ui.steps;

import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import ui.pages.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class MainPageSteps {
    MainPage mainPage = new MainPage();

    @Step("Открытие главной страницы")
    public void openPage() {
        open("/");
    }

    @Step("Нажатие на кнопку 'Начать обучение'")
    public void startLearnButton() {
        open("/");
        mainPage.startLearnButton.click();
    }

    @Step("Закрытие куки")
    public void closeCookie() {
        open("/");
        mainPage.closeCookie.click();
    }

    @Step("Открытие страницы в Telegram")
    public void telegramButton() {
        mainPage.scrollToButton.scrollIntoView(true);
        mainPage.telegramButton.click();
        switchTo().window(1);
    }

    @Step("Открытие страницы на YouTube")
    public void youtubeButton() {
        actions().sendKeys(Keys.PAGE_DOWN).perform();
        mainPage.youtubeButton.click();
        switchTo().window(1);
    }
}
