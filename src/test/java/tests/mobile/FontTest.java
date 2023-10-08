package tests.mobile;

import com.codeborne.selenide.WebDriverRunner;
import help.W3cActions;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;

import static com.codeborne.selenide.Selenide.sleep;

@Tag("Mobile")
public class FontTest extends TestBaseMobile {
    @Test
    public void fontTest(){
    stepsForApp();
    auth.navigateMenu();
        font.fontButton();
        sleep(3000);
    }
    private void stepsForApp() {
        auth.signInLink()
                .secretKeyLink()
                .loginKey()
                .loginButton()
                .closeBanner()
                .closeSecondBanner()
                .openLesson()
                .goBackButton();



    }

}
