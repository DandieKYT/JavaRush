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
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sideBarPage.openJavaUniversity.click();
    }

    @Step("Открытие вкладки 'Пользователи'")
    public void user() {
        open("/");
        WebDriverRunner.getWebDriver().manage().window().maximize();
        sideBarPage.users.click();
        sleep(2000);
    }

    @Step("Открытие вкладки 'Настройки'")
    public void openSettings() {
        refresh();
        sleep(5000);
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sideBarPage.clickImage.click();
        sideBarPage.bookmarks.scrollTo();
        sideBarPage.settings.click();
    }
}
