package mobile;

import config.BrowserstackConfig;
import mobile.steps.AuthenticationStep;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;

@Tag("Mobile")
public class Common {

    static AuthenticationStep auth = new AuthenticationStep();
    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    public static void stepsForApp() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey(config.getLoginKey());
        auth.loginButton();
        auth.closeBanner();
        auth.closeSecondBanner();
        auth.openLesson();
    }
}
