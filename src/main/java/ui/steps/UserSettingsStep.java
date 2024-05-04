package ui.steps;

import io.qameta.allure.Step;
import ui.pages.ProfileSettingsPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.sleep;

public class UserSettingsStep {

    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @Step("Нажатие на фотографию профиля")
    public void clickAvatarImage() {
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

    @Step("Открытие раздела Безопасность и вход")
    public void openSafetyAndEntry(){
       profileSettingsPage.securityAndEntry.click();
    }
    @Step("Нажатие на текст 'Вы можете удалить свой аккаунт и свои персональные данные'")
    public void clickTextForDeletingAccount(){
        profileSettingsPage.textForDeleteAccount.scrollIntoView(true);
        profileSettingsPage.textForDeleteAccount.click();
    }
    @Step("Ввод текста 'DELETE' и нажатие кнопки удалить")
    public void inputTextConfirmAndDeleteAccount(){
        profileSettingsPage.inputFieldForDelete.setValue("DELETE");
        profileSettingsPage.deleteButton.click();
    }
}
