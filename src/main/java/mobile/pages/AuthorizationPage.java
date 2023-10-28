package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class AuthorizationPage {

    public final SelenideElement signInLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/enterTextViewLink"));
    public final SelenideElement secretKeyLink = $(AppiumBy.id("com.hitechrush.jaxarush:id/changeLoginFragment"));
    public final SelenideElement loginKey = $(AppiumBy.id("com.hitechrush.jaxarush:id/secretKeyEditText"));
    public final SelenideElement loginButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/loginButton"));
    public final SelenideElement closeBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/bannerCloseButton"));
    public final SelenideElement closeSecondBanner = $(AppiumBy.id("com.hitechrush.jaxarush:id/iconTeacher"));
    public final SelenideElement openLesson = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[3]"));
    public final SelenideElement goBackButton = $(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
}
