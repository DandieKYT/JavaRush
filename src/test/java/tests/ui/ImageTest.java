package tests.ui;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static ui.Common.stepsForWebApp;

@Tag("UI")
public class ImageTest extends TestBase {
    @Test
    public void imageProfileUpload(){
        open("/");
        groupsStep.closeCookie();
        stepsForWebApp();
        refresh();
        refresh();
        $x("//a[contains(text(),'Сообщество')]").hover();
        $x("//*[contains(@class,'icon icon--common-caret')]").click();
        loadImageProfileStep.openSettings();
        sleep(3000);
    }
}
