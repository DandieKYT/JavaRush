package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.*;
import static ui.pages.SocialGroupsPage.*;

public class SocialGroupsStep {

    @Step("Открытие страницы на YouTube")
    public void youtubeButton() {
        actions().sendKeys(Keys.PAGE_DOWN).perform();
        youtubeButton.click();
        switchTo().window(1);
    }

    @Step("Проверка заголовка на YouTube")
    public void checkOutYoutubeTitle() {
        checkOutYoutubeTitle.shouldHave(Condition.text("JavaRush"));
        closeWindow();
        switchTo().window(0);
    }

    @Step("Открытие страницы в Telegram")
    public void telegramButton() {
        scrollToButton.scrollIntoView(true);
        telegramButton.click();
        switchTo().window(1);
    }

    @Step("Проверка заголовка на Telegram")
    public void checkOutTelegramTitle() {
        checkOutTelegramTitle.shouldBe(Condition.text("JavaRush"));
        sleep(1000);
        closeWindow();
        switchTo().window(0);
    }

    @Step("Закрытие куки")
    public void closeCookie() {
        open("/");
        closeCookie.click();
    }

    @Step("Закрытие куки ютуба")
    public void acceptCookieYT() {
        acceptCookieYT.click();
    }
}
