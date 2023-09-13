package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SocialGroupsPage {
    private SelenideElement
            closeCookie = $x("//button[@class='button button--sm-wide button--apply']"),
            scrollToButton = $x("//img[@alt='Google Play']"),
            acceptCookieYT = $x("//*[@aria-label='Accept all']"),
            youtubeButton = $x("//*[contains(@class, 'footer-soc__link--youtube')]"),
            checkOutYoutubeTitle = $x("//div[@id='inner-header-container']//yt-formatted-string[@id='text']"),
            telegramButton = $x("//*[contains(@class, 'footer-soc__link--telegram')]"),
            checkOutTelegramTitle = $x("//span[text()='JavaRush']");

    public SocialGroupsPage youtubeButton() {
        step("Открытие страницы на YouTube", () -> {
//            scrollToButton.scrollIntoView(true);
            Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
            Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
            Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
            Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
            Selenide.actions().sendKeys(Keys.PAGE_DOWN).perform();
            youtubeButton.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public SocialGroupsPage checkOutYoutubeTitle() {
        step("Проверка заголовка на YouTube", () -> {
            checkOutYoutubeTitle.shouldHave(text("JavaRush"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }
    public SocialGroupsPage telegramButton() {
        step("Открытие страницы в Telegram", () -> {
            scrollToButton.scrollIntoView(true);
            telegramButton.click();
            Selenide.switchTo().window(1);
        });
        return this;
    }
    public SocialGroupsPage checkOutTelegramTitle() {
        step("Проверка заголовка на Telegram", () -> {
            checkOutTelegramTitle.shouldBe(text("JavaRush"));
            Selenide.sleep(1000);
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return this;
    }
    public SocialGroupsPage closeCookie() {
        step("Закрытие куки", () -> {
            closeCookie.click();
        });
        return this;
    }
    public SocialGroupsPage acceptCookieYT() {
        step("Закрытие куки ютуба", () -> {
            acceptCookieYT.click();
        });
        return this;
    }
}
