package ui.steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Step;
import ui.pages.UploadImageToProfilePage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class UploadImageToProfileStep {

    UploadImageToProfilePage uploadImageToProfilePage = new UploadImageToProfilePage();

    @Step("Открытие вкладки 'Настройки'")
    public void openSettings() {
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(2000);
        uploadImageToProfilePage.clickImage.click();
        uploadImageToProfilePage.bookmarks.scrollTo();
        uploadImageToProfilePage.settings.click();
    }

    @Step("Нажатие на фотографию профиля")
    public void clickAvatarImage() {
        uploadImageToProfilePage.clickProfilePhoto.click();
    }

    @Step("Загрузка фотографии")
    public void uploadPhoto() {
        uploadImageToProfilePage.uploadPhoto.uploadFromClasspath("testFilePhoto.jpg");
    }

    @Step("Сохранение фотографии профиля")
    public void savePhoto() {
        uploadImageToProfilePage.savePhoto.click();
    }

    @Step("Проверка загрузки фотографии")
    public void checkUploadPhoto() {
        sleep(2000);
        uploadImageToProfilePage.checkUploadPhoto.should(visible);
    }

    @Step("Нажатие на кнопку 'Сохранить изменения'")
    public void saveChanges() {
        uploadImageToProfilePage.saveChanges.click();
    }

    @Step("Проверка надписи об успешном сохранении изменений")
    public void checkChanges() {
        uploadImageToProfilePage.checkSuccessFullChanges.should(text("Личные данные сохранены"));
    }
}
