package tests.mobile;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.sleep;

@Tag("Mobile")
public class FontTest extends TestBaseMobile {
    @Test
    public void fontTest() {
        stepsForApp();
        auth.navigateMenu();
        font.fontButton();
        sleep(3000);
    }

    private void stepsForApp() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey();
        auth.loginButton();
        auth.closeBanner();
        auth.closeSecondBanner();
        auth.openLesson();
        auth.goBackButton();


    }

}
