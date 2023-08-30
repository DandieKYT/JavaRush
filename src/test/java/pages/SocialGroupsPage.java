package pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SocialGroupsPage {
    private SelenideElement
            closeCookie = $x("//button[text()='Принять и закрыть']"),
            youtubeButton = $x("//*[contains(@class, 'footer-soc__link--youtube')]"),
            checkOutYoutubeTitle = $x("//*[@id='text']"),
            telegramButton = $x("//*[contains(@class, 'footer-soc__link--telegram')]"),
            checkOutTelegramTitle = $x("//span[text()='JavaRush']");

    public SocialGroupsPage youtubeButton() {
        step("Открытие страницы на YouTube", () -> {
            youtubeButton.scrollIntoView(false);
            youtubeButton.click();
            Selenide.switchTo().window(1);
        });
        return null;
    }
    public SocialGroupsPage checkOutYoutubeTitle() {
        step("Проверка заголовка на YouTube", () -> {
            checkOutYoutubeTitle.shouldBe(text("JavaRush"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return null;
    }
    public SocialGroupsPage telegramButton() {
        step("Открытие страницы в Telegram", () -> {
            youtubeButton.scrollIntoView(true);
            telegramButton.click();
            Selenide.switchTo().window(1);
        });
        return null;
    }
    public SocialGroupsPage checkOutTelegramTitle() {
        step("Проверка заголовка на Telegram", () -> {
            checkOutTelegramTitle.shouldBe(text("JavaRush"));
            Selenide.closeWindow();
            Selenide.switchTo().window(0);
        });
        return null;
    }
    public SocialGroupsPage closeCookie() {
        step("Закрытие куки", () -> {
            closeCookie.click();
        });
        return null;
    }
}
