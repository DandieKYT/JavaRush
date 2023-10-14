package tests.mobile;

import com.codeborne.selenide.Selenide;
import config.MobileConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class Authentication extends TestBaseMobile {
    static MobileConfig config = ConfigFactory.create(MobileConfig.class, System.getProperties());
    @Test
    @DisplayName("Авторизация по секретному ключу")
    public void loginBySecretKey() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey(config.getLoginKey());
        auth.loginButton();
    }
}
