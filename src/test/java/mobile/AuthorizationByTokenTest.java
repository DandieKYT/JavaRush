package mobile;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import mobile.config.BrowserstackConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
@Owner("Кудрявцев Даниил")
@Feature("Автотесты для Mobile")
@Story("Авторизация")
public class AuthorizationByTokenTest extends TestBaseMobile {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class, System.getProperties());

    @Test
    @DisplayName("Авторизация по секретному ключу")
    public void loginBySecretKey() {
        authorizationStep.signInLink();
        authorizationStep.secretKeyLink();
        authorizationStep.loginKey(config.getLoginKey());
        authorizationStep.loginButton();
    }
}
