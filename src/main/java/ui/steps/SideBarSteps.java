package ui.steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import ui.pages.SideBarPage;

import static com.codeborne.selenide.Selenide.*;

public class SideBarSteps {
    SideBarPage sideBarPage = new SideBarPage();
    @Step("Открытие вкладки Java-университет")
    public void openJavaUniversity() {
        open("/");
        sideBarPage.openJavaUniversity.click();
        switchTo().window(1);
    }

    @Step("Открытие вкладки 'Пользователи'")
    public void user() {
        open("/");
        sideBarPage.users.click();
    }

    @Step("Открытие вкладки 'Настройки'")
    public void openSettings() {
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(2000);
        sideBarPage.clickImage.click();
        sideBarPage.bookmarks.scrollTo();
        sideBarPage.settings.click();
    }
}