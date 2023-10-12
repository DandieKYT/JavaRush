package tests.ui;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;


@Tag("UITest")
public class TelegramTest extends TestBase {

    @DisplayName("Открытие страницы сайта в телеграм")
    @Test
    public void telegramTest() {
        groupsStep.closeCookie();
        groupsStep.telegramButton();
        groupsStep.checkOutTelegramTitle();
    }
}
