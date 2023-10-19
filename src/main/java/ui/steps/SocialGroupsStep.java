package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import ui.pages.SocialGroupsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;
import static ui.pages.SocialGroupsPage.*;

public class SocialGroupsStep {

    SocialGroupsPage socialGroupsPage = new SocialGroupsPage();

    @Step("Открытие страницы на YouTube")
    public void youtubeButton() {
        actions().sendKeys(Keys.PAGE_DOWN).perform();
        socialGroupsPage.youtubeButton.click();
        switchTo().window(1);
    }

    @Step("Проверка заголовка на YouTube")
    public void checkOutYoutubeTitle() {
        socialGroupsPage.checkOutYoutubeTitle.shouldHave(Condition.text("JavaRush"));
        closeWindow();
        switchTo().window(0);
    }

    @Step("Открытие страницы в Telegram")
    public void telegramButton() {
        socialGroupsPage.scrollToButton.scrollIntoView(true);
        socialGroupsPage.telegramButton.click();
        switchTo().window(1);
    }

    @Step("Проверка заголовка на Telegram")
    public void checkOutTelegramTitle() {
        socialGroupsPage.checkOutTelegramTitle.shouldBe(Condition.text("JavaRush"));
        sleep(1000);
        closeWindow();
        switchTo().window(0);
    }

    @Step("Закрытие куки")
    public void closeCookie() {
        open("/");
        socialGroupsPage.closeCookie.click();
    }

    @Step("Закрытие куки ютуба")
    public void acceptCookieYT() {
        if (socialGroupsPage.acceptCookieYT.has(visible)) {
            socialGroupsPage.acceptCookieYT.click();
        }
    }
}
