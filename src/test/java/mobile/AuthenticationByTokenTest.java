package mobile;

import config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class AuthenticationByTokenTest extends TestBaseMobile {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    @Test
    @DisplayName("Авторизация по секретному ключу")
    public void loginBySecretKey() {
        authenticationStep.signInLink();
        authenticationStep.secretKeyLink();
        authenticationStep.loginKey(config.getLoginKey());
        authenticationStep.loginButton();
    }
}
