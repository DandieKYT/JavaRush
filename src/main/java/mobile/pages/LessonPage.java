package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LessonPage {

    public final SelenideElement checkLikeValue = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesCount"));
    public final SelenideElement clickOnLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));
    public final SelenideElement likeButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton"));
}
