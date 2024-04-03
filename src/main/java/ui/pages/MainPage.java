package ui.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class MainPage {

    public final SelenideElement startLearnButton = $x("//*[contains(@class, 'header__start-d')]//span[text()='Начать обучение']");
    public final SelenideElement telegramButton = $x("//*[contains(@class, 'footer-soc__link--telegram')]");
    public final SelenideElement scrollToButton = $x("//img[@alt='Google Play']");
    public final SelenideElement youtubeButton = $x("//*[contains(@class, 'footer-soc__link--youtube')]");

    public final SelenideElement openTitle(String param) {
        return $x(String.format("(//a[text()='%s'])[position() > 1]", param));
    }
    public final SelenideElement openSecondTitle(String param) {
        return $x(String.format("//a[text()='%s']", param));
    }
    public final SelenideElement checkTitle(String expectedText) {
        return $((byTagAndText("h1", (expectedText))));
    }
}
