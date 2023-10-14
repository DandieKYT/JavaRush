package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class CommentPage {

    public static final SelenideElement checkoutText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public static final SelenideElement commentButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton"));
    public static final SelenideElement addComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab"));
    public static final SelenideElement inputComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public static final SelenideElement sendComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/send"));
    public static final SelenideElement commentOptions = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]"));
    public static final SelenideElement editComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/editButton"));
    public static final SelenideElement authorComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/userDisplayName"));
    public static final SelenideElement deleteComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));


}
