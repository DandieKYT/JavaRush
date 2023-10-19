package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SocialGroupsPage {
    public final SelenideElement closeCookie = $x("//button[text()='Принять и закрыть']");
    public final SelenideElement scrollToButton = $x("//img[@alt='Google Play']");
    public final SelenideElement acceptCookieYT = $x("//*[@aria-label='Accept all']");
    public final SelenideElement youtubeButton = $x("//*[contains(@class, 'footer-soc__link--youtube')]");
    public final SelenideElement checkOutYoutubeTitle = $x("//div[@id='inner-header-container']//yt-formatted-string[@id='text']");
    public final SelenideElement telegramButton = $x("//*[contains(@class, 'footer-soc__link--telegram')]");
    public final SelenideElement checkOutTelegramTitle = $x("//span[text()='JavaRush']");


}
