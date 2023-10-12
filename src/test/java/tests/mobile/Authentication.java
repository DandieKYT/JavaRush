package tests.mobile;

import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("Mobile")
public class Authentication extends TestBaseMobile {
    @Test
    @DisplayName("Авторизация по секретному ключу")
    public void loginBySecretKey() {
        auth.signInLink();
        auth.secretKeyLink();
        auth.loginKey();
        auth.loginButton();
    }
}
