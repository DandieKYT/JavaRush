package mobile.pages;

import com.codeborne.selenide.SelenideElement;
import io.appium.java_client.AppiumBy;

import static com.codeborne.selenide.Selenide.$;

public class CommentPage {

    public final SelenideElement checkoutText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public final SelenideElement commentButton = $(AppiumBy.id("com.hitechrush.jaxarush:id/commentsButton"));
    public final SelenideElement addComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentFab"));
    public final SelenideElement inputComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
    public final SelenideElement sendComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/send"));
    public final SelenideElement commentOptions = $(AppiumBy.xpath("(//android.widget.ImageView[@content-desc=\"JavaRush\"])[2]"));
    public final SelenideElement editComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/editButton"));
    public final SelenideElement authorComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/userDisplayName"));
    public final SelenideElement deleteComment = $(AppiumBy.id("com.hitechrush.jaxarush:id/deleteButton"));
    public final SelenideElement addSomeText = $(AppiumBy.id("com.hitechrush.jaxarush:id/addCommentText"));
}
