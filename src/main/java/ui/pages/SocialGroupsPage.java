package ui.pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;
import static io.qameta.allure.Allure.step;

public class SocialGroupsPage {
    public final static SelenideElement closeCookie = $x("//button[@class='button button--sm-wide button--apply']");
    public final static SelenideElement scrollToButton = $x("//img[@alt='Google Play']");
    public final static SelenideElement acceptCookieYT = $x("//*[@aria-label='Accept all']");
    public final static SelenideElement youtubeButton = $x("//*[contains(@class, 'footer-soc__link--youtube')]");
    public final static SelenideElement checkOutYoutubeTitle = $x("//div[@id='inner-header-container']//yt-formatted-string[@id='text']");
    public final static SelenideElement telegramButton = $x("//*[contains(@class, 'footer-soc__link--telegram')]");
    public final static SelenideElement checkOutTelegramTitle = $x("//span[text()='JavaRush']");


}
