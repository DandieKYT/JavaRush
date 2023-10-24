package mobile;

import config.BrowserstackConfig;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import mobile.steps.AuthenticationStep;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Tag;

@Tag("Mobile")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
@Story("Первый запуск приложения")
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
