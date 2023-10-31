package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public final SelenideElement startLearnButton = $x("//*[@id='button_menu_start_learning_unauthorized_user']");
    public final SelenideElement closeCookie = $x("//button[text()='Принять и закрыть']");
    public final SelenideElement telegramButton = $x("//*[contains(@class, 'footer-soc__link--telegram')]");
    public final SelenideElement scrollToButton = $x("//img[@alt='Google Play']");
    public final SelenideElement youtubeButton = $x("//*[contains(@class, 'footer-soc__link--youtube')]");

    public final SelenideElement openTitle(String param) {
        return $(byTagAndText("a", (param)));
    }

    public final SelenideElement checkTitle(String expectedText) {
        return $((byTagAndText("h1", (expectedText))));
    }
}
