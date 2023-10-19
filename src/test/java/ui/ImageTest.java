package ui;

import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static ui.Common.stepsForWebApp;

@Tag("UITest")
public class ImageTest extends TestBase {
    @Test
    public void imageProfileUpload() throws Exception{
        open("/");
        groupsStep.closeCookie();
        stepsForWebApp();
        refresh();
        WebDriverRunner.getWebDriver().manage().window().fullscreen();
        sleep(5000);
        loadImageProfileStep.openSettings();
        loadImageProfileStep.clickAvatarImage();
        loadImageProfileStep.uploadPhoto();
        loadImageProfileStep.checkUploadPhoto();
        loadImageProfileStep.savePhoto();
        loadImageProfileStep.saveChanges();
        loadImageProfileStep.checkChanges();


    }
}
