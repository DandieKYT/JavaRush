package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static io.qameta.allure.Allure.step;

public class LikeCommentPage {
    public static final SelenideElement commentButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton"));
    public static final SelenideElement addComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab"));
    public static final SelenideElement addSomeText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public static final SelenideElement sendComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/send"));
    public static final SelenideElement checkLikeValue = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesCount"));
    public static final SelenideElement addLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentLike"));
    public static final SelenideElement secondAddLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));
    public static final SelenideElement deleteComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));


}
