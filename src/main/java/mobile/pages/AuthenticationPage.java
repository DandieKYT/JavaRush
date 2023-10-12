package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class AuthenticationPage {
    String name;
    public static final SelenideElement signInLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink"));
    public static final SelenideElement secretKeyLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/changeLoginFragment"));
    public static final SelenideElement loginKey = $(AppiumBy.id("com.hitechrush.jaxarush:id/secretKeyEditText"));
    public static final SelenideElement loginButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/loginButton"));
    public static final SelenideElement closeBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/bannerCloseButton"));
    public static final SelenideElement closeSecondBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/iconTeacher"));
    public static final SelenideElement openLesson = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[3]"));
    public static final SelenideElement goBackButton = $(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));


//    private final ElementsCollection
//public AuthenticationPage navigateMenu() {
//    step("Переход назад", () -> {
//            goBackButton.click();
//    });
//    return this;
//}
//    public AuthenticationPage goBackButton() {
//        step("Переход назад", () -> {
//            for (int i = 0; i < 2; i++){
//                goBackButton.shouldBe((visible).because("Картинка не прогрузилась"));
//                goBackButton.click();
//            }
//        });
//        return this;
//    }
//    public AuthenticationPage openLesson() {
//        step("Открытие первого урока", () -> {
//             for (int i = 0; i < 2; i++){
//                 openLesson.click();
//            }
//        });
//        return this;
//    }
//    public AuthenticationPage closeSecondBanner() {
//        step("Закртие второго баннера", () -> {
//            for (int i = 0; i < 4; i++){
//                closeSecondBanner.click();
//            }
//        });
//        return this;
//    }
//    public AuthenticationPage closeBanner() {
//        step("Закртие баннера", () -> {
//                closeBanner.click();
//        });
//        return this;
//    }
//    public AuthenticationPage signInLink() {
//        step("Нажатие на ссылку 'Sign In'", () -> {
//            sleep(1000);
//            signInLink.shouldBe(exist);
//            signInLink.click();
//        });
//        return this;
//    }
//    public AuthenticationPage secretKeyLink() {
//        step("Нажатие на ссылку 'Sign in using secret key'", () -> {
//            secretKeyLink.click();
//        });
//        return this;
//    }
//    public AuthenticationPage loginKey() {
//        step("Ввод ключа авторизации", () -> {
//            loginKey.sendKeys("bdf08485-1a39-4a48-8a52-9c5d7a89e0ac");
//        });
//        return this;
//    }
//    public AuthenticationPage loginButton() {
//        step("Нажатие на кнопку 'Sign in'", () -> {
//            loginButton.click();
//        });
//        return this;
//    }
//    public AuthenticationPage someText() {
//        step("Генерация рандомного текста", () -> {
//            name = Generations.generationRandomName();
//        });
//        step("Генерация рандомного текста", () -> {
//            Assertions.assertEquals((name),text(name));
//        });
//        return this;
//    }
}
