package mobile.steps;

import io.qameta.allure.Step;
import mobile.pages.AuthorizationPage;

import static com.codeborne.selenide.Condition.exist;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.sleep;

public class AuthorizationStep {

    AuthorizationPage authorizationPage = new AuthorizationPage();

    @Step("Переход назад")
    public void navigateMenu() {
        authorizationPage.goBackButton.click();
    }

    @Step("Переход назад два раза")
    public void goBackButton() {
        for (int i = 0; i < 2; i++) {
            authorizationPage.goBackButton.shouldBe((visible).because("Картинка не прогрузилась"));
            authorizationPage.goBackButton.click();
        }
    }

    @Step("Открытие первого урока")
    public void openLesson() {
        for (int i = 0; i < 2; i++) {
            authorizationPage.openLesson.click();
        }
    }

    @Step("Закрытие второго баннера")
    public void closeSecondBanner() {
        for (int i = 0; i < 4; i++) {
            authorizationPage.closeSecondBanner.click();
        }
    }

    @Step("Закрытие баннера")
    public void closeBanner() {
        authorizationPage.closeBanner.click();
    }

    @Step("Нажатие на ссылку 'Sign In'")
    public void signInLink() {
        sleep(1000);
        authorizationPage.signInLink.shouldBe(exist);
        authorizationPage.signInLink.click();
    }

    @Step("Нажатие на ссылку 'Sign in using secret key'")
    public void secretKeyLink() {
        authorizationPage.secretKeyLink.click();
    }

    @Step("Ввод ключа авторизации")
    public void loginKey(String token) {
        authorizationPage.loginKey.sendKeys(token);
    }

    @Step("Нажатие на кнопку 'Sign in'")
    public void loginButton() {
        authorizationPage.loginButton.click();
    }
}
