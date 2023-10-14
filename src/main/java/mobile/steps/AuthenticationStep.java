package mobile.steps;

import com.codeborne.selenide.SelenideElement;
import config.MobileConfig;
import config.WebConfig;
import io.appium.java_client.AppiumBy;
import io.qameta.allure.Step;
import mobile.pages.Generations;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.Assertions;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static mobile.pages.AuthenticationPage.*;

public class AuthenticationStep {
    String name;



    @Step("Переход назад")
public void navigateMenu() {
            goBackButton.click();
}

    @Step("Переход назад два раза")
    public void goBackButton() {
            for (int i = 0; i < 2; i++){
                goBackButton.shouldBe((visible).because("Картинка не прогрузилась"));
                goBackButton.click();
            }
    }

    @Step("Открытие первого урока")
    public void openLesson() {
             for (int i = 0; i < 2; i++){
                 openLesson.click();
            }
    }

    @Step("Закрытие второго баннера")
    public void closeSecondBanner() {
            for (int i = 0; i < 4; i++){
                closeSecondBanner.click();
            }
    }

    @Step("Закрытие баннера")
    public void closeBanner() {
                closeBanner.click();
    }

    @Step("Нажатие на ссылку 'Sign In'")
    public void signInLink() {
            sleep(1000);
            signInLink.shouldBe(exist);
            signInLink.click();
    }

    @Step("Нажатие на ссылку 'Sign in using secret key'")
    public void secretKeyLink() {
            secretKeyLink.click();
    }

    @Step("Ввод ключа авторизации")
    public void loginKey(String token) {

            loginKey.sendKeys(token);
    }

    @Step("Нажатие на кнопку 'Sign in'")
    public void loginButton() {
            loginButton.click();
    }

    @Step("Генерация рандомного текста")
    public void someText() {
            name = Generations.generationRandomName();
            Assertions.assertEquals((name),text(name));
    }
}
