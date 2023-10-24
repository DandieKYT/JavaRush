package ui.steps;

import io.qameta.allure.Step;
import ui.pages.ProfileSettingsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class ProfileSettingsStep {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @Step("Нажатие на фотографию профиля")
    public void clickAvatarImage() {
        profileSettingsPage.clickProfilePhoto.click();
    }

    @Step("Загрузка фотографии")
    public void uploadPhoto() {
        profileSettingsPage.uploadPhoto.uploadFromClasspath("testFilePhoto.jpg");
    }

    @Step("Сохранение фотографии профиля")
    public void savePhoto() {
        profileSettingsPage.savePhoto.click();
    }

    @Step("Проверка загрузки фотографии")
    public void checkUploadPhoto() {
        sleep(2000);
        profileSettingsPage.checkUploadPhoto.should(visible);
    }

    @Step("Нажатие на кнопку 'Сохранить изменения'")
    public void saveChanges() {
        profileSettingsPage.saveChanges.click();
    }

    @Step("Проверка надписи об успешном сохранении изменений")
    public void checkChanges() {
        profileSettingsPage.checkSuccessFullChanges.should(text("Личные данные сохранены"));
    }
}
