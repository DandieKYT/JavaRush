package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class LikePage {

    public final SelenideElement commentButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton"));
    public final SelenideElement addComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab"));
    public final SelenideElement addSomeText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public final SelenideElement sendComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/send"));
    public final SelenideElement checkLikeValue = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesCount"));
    public final SelenideElement addLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentLike"));
    public final SelenideElement secondAddLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));
    public final SelenideElement deleteComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));
    public final SelenideElement likeButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/likesButton"));
    public final SelenideElement clickOnLike = $(AppiumBy.id("com.hitechrush.jaxarush:id/itemLikeDesc"));
}
