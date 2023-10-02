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
        swipeFromRightToLeft();
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
    @Step("Свайп справа налево")
    public static void swipeFromRightToLeft() {
        AppiumDriver driver = (AppiumDriver) WebDriverRunner.getWebDriver();

        Dimension dimension = driver.manage().window().getSize();
        Point start = new Point((int) (dimension.width * 0.9), (int) (dimension.height * 0.9));
        Point end = new Point((int) (dimension.width * 0.2), (int) (dimension.height * 0.1));
        W3cActions.doSwipe(driver, start, end, 100);  //with duration 1s
    }
}
