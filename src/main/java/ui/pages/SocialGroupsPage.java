package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SocialGroupsPage {

    public final SelenideElement acceptCookieYT = $x("//*[@aria-label='Accept all']");
    public final SelenideElement checkOutYoutubeTitle = $x("//div[@id='inner-header-container']//yt-formatted-string[@id='text']");
    public final SelenideElement checkOutTelegramTitle = $x("//span[text()='JavaRush']");
}
