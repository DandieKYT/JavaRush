package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.SideBarMenuPage;

import static com.codeborne.selenide.Condition.text;

public class SideBarStep {

    SideBarMenuPage sideBarMenuPage = new SideBarMenuPage();

    @Step("Открытие вкладки")
    public void tag(String param) {
        sideBarMenuPage.tag.find(text(param)).click();
    }

    @Step("Проверка содержимого вкладки")
    public void checkTitle(String expectedText) {
        sideBarMenuPage.checkTitle.shouldBe(text(expectedText));
    }
}
