package mobile.steps;

import mobile.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;

public class MobileCommonStep {

    static AuthorizationStep auth = new AuthorizationStep();
    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    public void stepsForApp() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey(config.getLoginKey());
        auth.loginButton();
        auth.closeBanner();
        auth.closeSecondBanner();
        auth.openLesson();
    }
}
