package mobile.steps;

import help.Generations;
import io.qameta.allure.Step;
import mobile.pages.AuthenticationByTokenPage;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.sleep;

public class AuthenticationStep {

    String name;
    AuthenticationByTokenPage authenticationByTokenPage = new AuthenticationByTokenPage();

    @Step("Переход назад")
    public void navigateMenu() {
        authenticationByTokenPage.goBackButton.click();
    }

    @Step("Переход назад два раза")
    public void goBackButton() {
        for (int i = 0; i < 2; i++) {
            authenticationByTokenPage.goBackButton.shouldBe((visible).because("Картинка не прогрузилась"));
            authenticationByTokenPage.goBackButton.click();
        }
    }

    @Step("Открытие первого урока")
    public void openLesson() {
        for (int i = 0; i < 2; i++) {
            authenticationByTokenPage.openLesson.click();
        }
    }

    @Step("Закрытие второго баннера")
    public void closeSecondBanner() {
        for (int i = 0; i < 4; i++) {
            authenticationByTokenPage.closeSecondBanner.click();
        }
    }

    @Step("Закрытие баннера")
    public void closeBanner() {
        authenticationByTokenPage.closeBanner.click();
    }

    @Step("Нажатие на ссылку 'Sign In'")
    public void signInLink() {
        sleep(1000);
        authenticationByTokenPage.signInLink.shouldBe(exist);
        authenticationByTokenPage.signInLink.click();
    }

    @Step("Нажатие на ссылку 'Sign in using secret key'")
    public void secretKeyLink() {
        authenticationByTokenPage.secretKeyLink.click();
    }

    @Step("Ввод ключа авторизации")
    public void loginKey(String token) {
        authenticationByTokenPage.loginKey.sendKeys(token);
    }

    @Step("Нажатие на кнопку 'Sign in'")
    public void loginButton() {
        authenticationByTokenPage.loginButton.click();
    }

    @Step("Генерация рандомного текста")
    public void someText() {
        name = Generations.generationRandomText();
        Assertions.assertEquals((name), text(name));
    }
}
