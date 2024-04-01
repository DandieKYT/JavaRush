package ui.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.selector.ByTagAndText;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import ui.pages.MainPage;

import static com.codeborne.selenide.Condition.text;
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
        $x("//*[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']").click();
        mainPage.startLearnButton.click();
        switchTo().window(1);
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

    @Step("Открытие вкладки")
    public void opensTitle(String param) {
        if (param.equals("О нас")){
            mainPage.openSecondTitle(param).click();
        }
        else {
            mainPage.openTitle(param).click();
        }
    }

    @Step("Проверка содержимого вкладки")
    public void checksTitle(String expectedText) {
        mainPage.checkTitle(expectedText).shouldBe(text(expectedText));
    }
}

