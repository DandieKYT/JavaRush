package ui.steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import ui.pages.LoadImageProfilePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class LoadImageProfileStep {

    LoadImageProfilePage loadImageProfilePage = new LoadImageProfilePage();

    @Step("Открытие вкладки 'Настройки'")
    public void openSettings() {
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(2000);
        loadImageProfilePage.clickImage.click();
        loadImageProfilePage.bookmarks.scrollTo();
        loadImageProfilePage.settings.click();
    }

    @Step("Нажатие на фотографию профиля")
    public void clickAvatarImage() {
        loadImageProfilePage.clickProfilePhoto.click();
    }

    @Step("Загрузка фотографии")
    public void uploadPhoto() {
        loadImageProfilePage.uploadPhoto.uploadFromClasspath("testFilePhoto.jpg");
    }

    @Step("Сохранение фотографии профиля")
    public void savePhoto() {
        loadImageProfilePage.savePhoto.click();
    }

    @Step("Проверка загрузки фотографии")
    public void checkUploadPhoto() {
        sleep(2000);
        loadImageProfilePage.checkUploadPhoto.should(visible);
    }

    @Step("Нажатие на кнопку 'Сохранить изменения'")
    public void saveChanges() {
        loadImageProfilePage.saveChanges.click();
    }

    @Step("Проверка надписи об успешном сохранении изменений")
    public void checkChanges() {
        loadImageProfilePage.checkSuccessFullChanges.should(text("Личные данные сохранены"));
    }
}
