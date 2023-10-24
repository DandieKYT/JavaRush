package mobile;

import config.BrowserstackConfig;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
@Story("Аутентификация")
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
