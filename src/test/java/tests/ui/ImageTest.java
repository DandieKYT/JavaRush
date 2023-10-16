package tests.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static ui.Common.stepsForWebApp;

@Tag("UI")
public class ImageTest extends TestBase {
    @Test
     void imageProfileUpload(){
        stepsForWebApp();
        groupsStep.closeCookie();
        loadImageProfileStep.collapseMenu();
        loadImageProfileStep.openSettings();
        sleep(3000);
    }
}
