package ui;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static ui.Common.stepsForWebApp;

@Tag("UITest")
public class UserSettingsTest extends TestBase {

    @Test
    public void imageProfileUpload() throws Exception {
        mainPageSteps.closeCookie();
        stepsForWebApp();
        refresh();
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(5000);
        sideBarSteps.openSettings();
        userSettingsStep.clickAvatarImage();
        userSettingsStep.uploadPhoto();
        userSettingsStep.checkUploadPhoto();
        userSettingsStep.savePhoto();
        userSettingsStep.saveChanges();
        userSettingsStep.checkChanges();
    }
}
