package tests.mobile;

import config.MobileConfig;
import mobile.steps.AuthenticationStep;
import org.aeonbits.owner.ConfigFactory;

public class Common {
    static AuthenticationStep auth = new AuthenticationStep();
     static MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
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
