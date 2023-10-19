package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UITest")
@Owner("Кудрявцев Даниил")
@Story("Переход в соц сети")
@Feature("Автотесты для UI")
public class OpenSocialGroupsTest extends TestBase {

    @Test
    @DisplayName("Открытие страницы сайта в телеграм")
    public void openTelegramPageTest() {
        openSocialGroupsStep.closeCookie();
        openSocialGroupsStep.telegramButton();
        openSocialGroupsStep.checkOutTelegramTitle();
    }

    @Test
    @DisplayName("Открытие страницы сайта в YouTube")
    public void openYouTubePageTest() {
        openSocialGroupsStep.closeCookie();
        openSocialGroupsStep.youtubeButton();
        openSocialGroupsStep.acceptCookieYT();
        openSocialGroupsStep.checkOutYoutubeTitle();
    }
}
