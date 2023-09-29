package pagesMobile;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class AddLikeLessonPage {
    public SelenideElement count = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikesCount"));
}
