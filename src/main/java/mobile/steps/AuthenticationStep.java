package mobile.steps;

import io.qameta.allure.Step;
import help.Generations;
import mobile.pages.AuthenticationPage;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static mobile.pages.AuthenticationPage.*;

public class AuthenticationStep {
    String name;

    AuthenticationPage authenticationPage = new AuthenticationPage();
    @Step("Переход назад")
public void navigateMenu() {
        authenticationPage.goBackButton.click();
}

    @Step("Переход назад два раза")
    public void goBackButton() {
            for (int i = 0; i < 2; i++){
                authenticationPage.goBackButton.shouldBe((visible).because("Картинка не прогрузилась"));
                authenticationPage.goBackButton.click();
            }
    }

    @Step("Открытие первого урока")
    public void openLesson() {
             for (int i = 0; i < 2; i++){
                 authenticationPage.openLesson.click();
            }
    }

    @Step("Закрытие второго баннера")
    public void closeSecondBanner() {
            for (int i = 0; i < 4; i++){
                authenticationPage.closeSecondBanner.click();
            }
    }

    @Step("Закрытие баннера")
    public void closeBanner() {
        authenticationPage.closeBanner.click();
    }

    @Step("Нажатие на ссылку 'Sign In'")
    public void signInLink() {
            sleep(1000);
        authenticationPage.signInLink.shouldBe(exist);
        authenticationPage.signInLink.click();
    }

    @Step("Нажатие на ссылку 'Sign in using secret key'")
    public void secretKeyLink() {
        authenticationPage.secretKeyLink.click();
    }

    @Step("Ввод ключа авторизации")
    public void loginKey(String token) {
        authenticationPage.loginKey.sendKeys(token);
    }

    @Step("Нажатие на кнопку 'Sign in'")
    public void loginButton() {
        authenticationPage.loginButton.click();
    }

    @Step("Генерация рандомного текста")
    public void someText() {
            name = Generations.generationRandomText();
            Assertions.assertEquals((name),text(name));
    }
}
