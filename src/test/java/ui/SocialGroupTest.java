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
public class SocialGroupTest extends TestBase {

    @Test
    @DisplayName("Открытие страницы сайта в телеграм")
    public void telegramTest() {
        groupsStep.closeCookie();
        groupsStep.telegramButton();
        groupsStep.checkOutTelegramTitle();
    }

    @Test
    @DisplayName("Открытие страницы сайта в YouTube")
    public void youTubeTest() {
        groupsStep.closeCookie();
        groupsStep.youtubeButton();
        groupsStep.acceptCookieYT();
        groupsStep.checkOutYoutubeTitle();
    }
}
