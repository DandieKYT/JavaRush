package pagesMobile;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class AuthenticationPage {
    private SelenideElement
            signInLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink")),
            secretKeyLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/changeLoginFragment")),
            loginKey = $(AppiumBy.id("com.hitechrush.jaxarush:id/secretKeyEditText")),
            loginButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/loginButton"));

    public void loginBySecretKey(){
                signInLink();
                secretKeyLink();
                loginKey();
                loginButton();
    }

    public AuthenticationPage signInLink() {
        step("Нажатие на ссылку 'Sign In'", () -> {
            signInLink.click();
        });
        return this;
    }
    public AuthenticationPage secretKeyLink() {
        step("Нажатие на ссылку 'Sign in using secret key'", () -> {
            secretKeyLink.click();
        });
        return this;
    }
    public AuthenticationPage loginKey() {
        step("Ввод ключа авторизации", () -> {
            loginKey.sendKeys("bdf08485-1a39-4a48-8a52-9c5d7a89e0ac");
        });
        return this;
    }
    public AuthenticationPage loginButton() {
        step("Нажатие на кнопку 'Sign in'", () -> {
            loginButton.click();
        });
        return this;
    }
}
