package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import ui.pages.OpenSocialGroupsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class OpenSocialGroupsStep {

    OpenSocialGroupsPage openSocialGroupsPage = new OpenSocialGroupsPage();

    @Step("Открытие страницы на YouTube")
    public void youtubeButton() {
        actions().sendKeys(Keys.PAGE_DOWN).perform();
        openSocialGroupsPage.youtubeButton.click();
        switchTo().window(1);
    }

    @Step("Проверка заголовка на YouTube")
    public void checkOutYoutubeTitle() {
        openSocialGroupsPage.checkOutYoutubeTitle.shouldHave(Condition.text("JavaRush"));
        closeWindow();
        switchTo().window(0);
    }

    @Step("Открытие страницы в Telegram")
    public void telegramButton() {
        openSocialGroupsPage.scrollToButton.scrollIntoView(true);
        openSocialGroupsPage.telegramButton.click();
        switchTo().window(1);
    }

    @Step("Проверка заголовка на Telegram")
    public void checkOutTelegramTitle() {
        openSocialGroupsPage.checkOutTelegramTitle.shouldBe(Condition.text("JavaRush"));
        sleep(1000);
        closeWindow();
        switchTo().window(0);
    }

    @Step("Закрытие куки")
    public void closeCookie() {
        open("/");
        openSocialGroupsPage.closeCookie.click();
    }

    @Step("Закрытие куки ютуба")
    public void acceptCookieYT() {
        if (openSocialGroupsPage.acceptCookieYT.has(visible)) {
            openSocialGroupsPage.acceptCookieYT.click();
        }
    }
}
