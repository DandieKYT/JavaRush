package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
@Owner("Кудрявцев Даниил")
@Story("Социальные сети")
@Feature("Автотесты для UI")
public class OpenSocialGroupsTest extends TestBase {

    @Test
    @DisplayName("Открытие страницы сайта в Telegram")
    public void openTelegramPageTest() {
        mainPageSteps.closeCookie();
        mainPageSteps.telegramButton();
        socialGroupsStep.checkOutTelegramTitle();
    }

    @Test
    @DisplayName("Открытие страницы сайта в YouTube")
    public void openYouTubePageTest() {
        mainPageSteps.closeCookie();
        mainPageSteps.youtubeButton();
        socialGroupsStep.acceptCookieYT();
        socialGroupsStep.checkOutYoutubeTitle();
    }
}
