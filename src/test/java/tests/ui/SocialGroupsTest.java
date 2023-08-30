package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SocialGroupsTest extends TestBase {
    @DisplayName("Открытие страницы сайта в социальных группах")
    @Test
    public void telegramYoutubeTest(){
        basePage.openPage();
        groupsPage.closeCookie();
        groupsPage.telegramButton();
        groupsPage.checkOutTelegramTitle();
        groupsPage.youtubeButton();
        groupsPage.checkOutYoutubeTitle();
    }

}
