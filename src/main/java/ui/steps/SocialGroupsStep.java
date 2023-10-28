package ui.steps;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;
import ui.pages.SocialGroupsPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class SocialGroupsStep {

    SocialGroupsPage socialGroupsPage = new SocialGroupsPage();

    @Step("Проверка заголовка на YouTube")
    public void checkOutYoutubeTitle() {
        socialGroupsPage.checkOutYoutubeTitle.shouldHave(Condition.text("JavaRush"));
        closeWindow();
        switchTo().window(0);
    }

    @Step("Проверка заголовка на Telegram")
    public void checkOutTelegramTitle() {
        socialGroupsPage.checkOutTelegramTitle.shouldBe(Condition.text("JavaRush"));
        sleep(1000);
        closeWindow();
        switchTo().window(0);
    }

    @Step("Закрытие куки ютуба")
    public void acceptCookieYT() {
        if (socialGroupsPage.acceptCookieYT.has(visible)) {
            socialGroupsPage.acceptCookieYT.click();
        }
    }
}
