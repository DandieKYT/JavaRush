package ui;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("UI")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для UI")
@Story("Настройки пользователя")
public class UserSettingsTest extends TestBase {

    String photoName = "testFilePhoto.jpg";

    @Test
    @DisplayName("Загрузка картинки в профиль")
    public void imageProfileUpload() {
        mainPageSteps.openPage();
        common.stepsForWebApp();
        sideBarSteps.openSettings();
        userSettingsStep.clickAvatarImage();
        userSettingsStep.uploadPhoto(photoName);
        userSettingsStep.checkUploadPhoto();
        userSettingsStep.savePhoto();
        userSettingsStep.saveChanges();
        userSettingsStep.checkChanges();
    }
}
