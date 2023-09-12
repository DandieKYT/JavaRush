package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class SocialGroupsTest extends TestBase {
    @DisplayName("Открытие страницы сайта в социальных группах")
    @Test
    public void telegramTest(){
        basePage.openPage();
        groupsPage.closeCookie()
        .telegramButton()
        .checkOutTelegramTitle();
    }
    @Test
    public void youtubeTest(){
        basePage.openPage();
        groupsPage.closeCookie()
               .youtubeButton()
                .acceptCookieYT()
               .checkOutYoutubeTitle();
    }
}
