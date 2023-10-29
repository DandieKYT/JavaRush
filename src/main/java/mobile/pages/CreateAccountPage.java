package mobile.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CreateAccountPage {

    public final ElementsCollection startButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/start"));
    public final ElementsCollection secondStartButton = $$(AppiumBy.id("com.hitechrush.jaxarush:id/startQuiz1"));
    public final ElementsCollection languageRussian = $$(AppiumBy.className("android.widget.LinearLayout"));
    public final ElementsCollection checkoutTitle = $$(AppiumBy.id("com.hitechrush.jaxarush:id/authHeaderTitle"));

    public final SelenideElement qaButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/qaEngineer"));
    public final SelenideElement literaryStyle = $(AppiumBy.id("com.hitechrush.jaxarush:id/plotStyleCard"));
    public final SelenideElement motivationNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/motivationNoCard"));
    public final SelenideElement lightTheme = $(AppiumBy.id("com.hitechrush.jaxarush:id/quizThemeLight"));
    public final SelenideElement experienceNo = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceNo"));
    public final SelenideElement experienceYes = $(AppiumBy.id("com.hitechrush.jaxarush:id/experienceYes"));
    public final SelenideElement checkoutCourse = $(AppiumBy.className("android.widget.TextView"));
}
