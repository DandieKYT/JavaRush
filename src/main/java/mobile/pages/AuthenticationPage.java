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


}
