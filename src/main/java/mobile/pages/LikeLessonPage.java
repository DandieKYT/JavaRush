package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LikeLessonPage {

    public final static SelenideElement likeCheck = $(AppiumBy.id("com.hitechrush.jaxarush:id/lectureLikesCount"));
    public final static SelenideElement likeButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton"));
    public final static SelenideElement clickOnLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));

}
