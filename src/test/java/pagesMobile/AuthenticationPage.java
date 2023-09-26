package pagesMobile;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;
import org.testng.Assert;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;
import static pagesMobile.Generations.generationRandomName;

public class AuthenticationPage {
    String name;
    private final SelenideElement
            signInLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink")),
            secretKeyLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/changeLoginFragment")),
            loginKey = $(AppiumBy.id("com.hitechrush.jaxarush:id/secretKeyEditText")),
            loginButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/loginButton")),
            closeBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/bannerCloseButton")),
            closeSecondBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/iconTeacher")),
            openLesson = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[3]")),
            goBackButton = $(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));


//    private final ElementsCollection
public AuthenticationPage navigateMenu() {
    step("Переход назад", () -> {
            goBackButton.click();
    });
    return this;
}
    public AuthenticationPage goBackButton() {
        step("Переход назад", () -> {
            for (int i = 0; i < 2; i++){
                goBackButton.shouldBe((visible).because("Картинка не прогрузилась"));
                goBackButton.click();
            }
        });
        return this;
    }
    public AuthenticationPage openLesson() {
        step("Открытие первого урока", () -> {
             for (int i = 0; i < 2; i++){
                 openLesson.click();
            }
        });
        return this;
    }
    public AuthenticationPage closeSecondBanner() {
        step("Закртие второго баннера", () -> {
            for (int i = 0; i < 4; i++){
                closeSecondBanner.click();
            }
//            closeSecondBanner.click();
//            closeSecondBanner.click();
//            closeSecondBanner.click();
//            closeSecondBanner.click();
        });
        return this;
    }
    public AuthenticationPage closeBanner() {
        step("Закртие баннера", () -> {
            closeBanner.click();
        });
        return this;
    }
    public AuthenticationPage signInLink() {
        step("Нажатие на ссылку 'Sign In'", () -> {
            sleep(1000);
            signInLink.shouldBe(exist);
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
    public AuthenticationPage someText() {
        step("Генерация рандомного текста", () -> {
            name = generationRandomName();
        });
        step("Генерация рандомного текста", () -> {
            Assert.assertEquals((name),text(name));
        });
        return this;
    }
}
