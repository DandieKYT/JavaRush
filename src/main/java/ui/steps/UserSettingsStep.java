package ui.steps;

import io.qameta.allure.Step;
import ui.pages.MainPage;
import ui.pages.ProfileSettingsPage;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class UserSettingsStep {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();
    MainPage mainPage = new MainPage();

    @Step("Нажатие на фотографию профиля")
    public void clickAvatarImage() {
        sleep(2000);
        profileSettingsPage.clickProfilePhoto.click();
    }

    @Step("Загрузка фотографии")
    public void uploadPhoto(String uploadPhoto) {
        profileSettingsPage.uploadPhoto.uploadFromClasspath(uploadPhoto);
    }

    @Step("Сохранение фотографии профиля")
    public void savePhoto() {
        profileSettingsPage.savePhoto.click();
    }

    @Step("Проверка загрузки фотографии")
    public void checkUploadPhoto() {
        sleep(2000);
        profileSettingsPage.checkUploadPhoto.should(visible.because("Фотография не загружена"));
    }

    @Step("Нажатие на кнопку 'Сохранить изменения'")
    public void saveChanges() {
        profileSettingsPage.saveChanges.click();
    }

    @Step("Проверка надписи об успешном сохранении изменений")
    public void checkChanges() {
        profileSettingsPage.checkSuccessFullChanges.should(text("Личные данные сохранены").because("Текст об изменении фотографии не найден"));
    }

    @Step("Открытие раздела Безопасность и вход")
    public void openSafetyAndEntry() {
        profileSettingsPage.securityAndEntry.click();
    }

    @Step("Скролл страницы вниз")
    public void scrollPageDown() {
        sleep(1000);
        mainPage.youtubeButton.scrollTo();
    }

    @Step("Нажатие на текст 'Вы можете удалить свой аккаунт и свои персональные данные'")
    public void clickTextForDeletingAccount() {
        profileSettingsPage.textForDeleteAccount.scrollTo();
        profileSettingsPage.textForDeleteAccount.click();
    }

    @Step("Ввод текста 'DELETE' и нажатие кнопки удалить")
    public void inputTextConfirmAndDeleteAccount() {
        profileSettingsPage.inputFieldForDelete.setValue("DELETE");
        profileSettingsPage.deleteButton.click();
    }

    @Step("Проверка удаления аккаунта")
    public void checkDeleteAccount() {
        mainPage.startLearnButton.shouldBe(visible.because("Аккаунт не удален"));
    }
}
